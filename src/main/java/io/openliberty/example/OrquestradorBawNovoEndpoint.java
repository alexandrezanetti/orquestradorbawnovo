package io.openliberty.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import cgcc.integracao.conteudo.RequestAtualizarPorId;
import cgcc.integracao.conteudo.RequestAtualizarPorNome;
import cgcc.integracao.conteudo.RequestCriar;
import cgcc.integracao.conteudo.RequestExcluirPorId;
import cgcc.integracao.conteudo.RequestExcluirPorIdLogico;
import cgcc.integracao.conteudo.RequestExcluirPorNome;
import cgcc.integracao.conteudo.RequestExcluirPorNomeLogico;
import cgcc.integracao.conteudo.RequestReverterExclusaoLogicaPorId;
import cgcc.integracao.conteudo.RequestReverterExclusaoLogicaPorNome;
import cgcc.integracao.conteudo.ResponseObter;

@Path("/cgcc_integracao_conteudo/rest")
public class OrquestradorBawNovoEndpoint{
    @GET
    @Path("/v1/conteudo/obterPorId")
    @Produces("application/json")
	public Object conteudo​ObterPorId(	@DefaultValue("") @QueryParam("centroCusto") String centroCusto,	
										@DefaultValue("") @QueryParam("canal") String canal,
										@DefaultValue("") @QueryParam("usuario") String usuario,
										@DefaultValue("") @QueryParam("senha") String senha,
										@DefaultValue("") @QueryParam("objectStore") String objectStore,
										@DefaultValue("") @QueryParam("id") String id) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ObterPorId ###");

		Object msgRequest = new Object();
		if ("".equals(centroCusto) ) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if ("".equals(canal) ) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if ("".equals(usuario) ) { 
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if ("".equals(senha) ) { 
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else  if ("".equals(objectStore) ) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if ("".equals(id) ) {
			return MsgResponse400(msgRequest, "Id obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200Arq(msgRequest);
		}

    }
    
    @GET
    @Path("/v1/conteudo/obterPorNome")
    @Produces("application/json")
	public Object conteudo​ObterPorNome(	@DefaultValue("") @QueryParam("centroCusto") String centroCusto,	
										@DefaultValue("") @QueryParam("canal") String canal,
										@DefaultValue("") @QueryParam("usuario") String usuario,
										@DefaultValue("") @QueryParam("senha") String senha,
										@DefaultValue("") @QueryParam("objectStore") String objectStore,
										@DefaultValue("") @QueryParam("nome") String nome) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ObterPorNome ###");

		Object msgRequest = new Object();
		if ("".equals(centroCusto) ) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if ("".equals(canal) ) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if ("".equals(usuario) ) { 
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if ("".equals(senha) ) { 
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else  if ("".equals(objectStore) ) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if ("".equals(nome) ) {
			return MsgResponse400(msgRequest, "Nome obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200Arq(msgRequest);
		}
    }

    @POST
    @Path("/v1/conteudo/criarUnfiled")
    @Produces("application/json")
	public Object conteudoCriarUnfiled(RequestCriar msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudoCriarUnfiled ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getTitulo() == null) {
			return MsgResponse400(msgRequest, "Título obrigatório(a)");
		}
		else if (msgRequest.getClasseDocumento() == null) {
			return MsgResponse400(msgRequest, "Classe Documento obrigatória");
		}
		else if (msgRequest.getExtensao() == null) {
			return MsgResponse400(msgRequest, "Extensão obrigatória");
		}
		else if (msgRequest.getMimetype() == null) {
			return MsgResponse400(msgRequest, "Mimetype obrigatória");
		}
		else if (msgRequest.getMetadados() == null || msgRequest.getMetadados().isEmpty()) {
			  return MsgResponse400(msgRequest, "Metadados obrigatório(a)");
		}
		else if (msgRequest.getArquivos() == null || msgRequest.getArquivos().isEmpty()) {
			return MsgResponse400(msgRequest, "Arquivo obrigatório(a)");
		}
		else
		{
			return MsgResponseCriar201(msgRequest);
		}
    }

    @POST
    @Path("/v1/conteudo/criar")
    @Produces("application/json")
	public Object conteudo​Criar(RequestCriar msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​Criar ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getCaminhoCompleto() == null) {
			return MsgResponse400(msgRequest, "Caminho Completo obrigatório(a)");
		}
		else if (msgRequest.getTitulo() == null) {
			return MsgResponse400(msgRequest, "Título obrigatório(a)");
		}
		else if (msgRequest.getClasseDocumento() == null) {
			return MsgResponse400(msgRequest, "Classe Documento obrigatória");
		}
		else if (msgRequest.getExtensao() == null) {
			return MsgResponse400(msgRequest, "Extensão obrigatória");
		}
		else if (msgRequest.getMimetype() == null) {
			return MsgResponse400(msgRequest, "Mimetype obrigatória");
		}
		else if (msgRequest.getMetadados() == null || msgRequest.getMetadados().isEmpty()) {
			  return MsgResponse400(msgRequest, "Metadados obrigatório(a)");
		}
		else if (msgRequest.getArquivos() == null || msgRequest.getArquivos().isEmpty()) {
			return MsgResponse400(msgRequest, "Arquivo obrigatório(a)");
		}
		else
		{
			return MsgResponseCriar201(msgRequest);
		}
    }

    
    @POST
    @Path("/v1/conteudo/atualizarPorId")
    @Produces("application/json")
	public Object conteudoAtualizarPorId(RequestAtualizarPorId msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudoAtualizarPorId ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getId() == null) {
			return MsgResponse400(msgRequest, "Id obrigatório(a)");
		}
		else if (msgRequest.getClasseDocumento() == null) {
			return MsgResponse400(msgRequest, "Classe Documento obrigatória");
		}
		else if (msgRequest.getNomeMetadadoTipoConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadados Tipo Conteudo obrigatório(a)");
		}
		else if (msgRequest.getTipoConteudo() == null) {
			return MsgResponse400(msgRequest, "Tipo Conteudo obrigatório(a)");
		}
		else if (msgRequest.getNomeMetadadoStatusConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadados Status Conteudo obrigatório(a)");
		}
		else if (msgRequest.getTipoAtualizacao() == null) {
			return MsgResponse400(msgRequest, "Tipo atualização obrigatório(a)");
		}
		else if (msgRequest.getMetadados() == null || msgRequest.getMetadados().isEmpty()) {
			  return MsgResponse400(msgRequest, "Metadados obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}

    @POST
    @Path("/v1/conteudo/atualizarPorNome")
    @Produces("application/json")
	public Object conteudo​AtualizarPorNome(RequestAtualizarPorNome msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​AtualizarPorNome ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getNome() == null) {
			return MsgResponse400(msgRequest, "Nome obrigatório(a)");
		}
		else if (msgRequest.getClasseDocumento() == null) {
			return MsgResponse400(msgRequest, "Classe Documento obrigatória");
		}
		else if (msgRequest.getNomeMetadadoTipoConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadados Tipo Conteudo obrigatório(a)");
		}
		else if (msgRequest.getTipoConteudo() == null) {
			return MsgResponse400(msgRequest, "Tipo Conteudo obrigatório(a)");
		}
		else if (msgRequest.getNomeMetadadoStatusConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadados Status Conteudo obrigatório(a)");
		}
		else if (msgRequest.getTipoAtualizacao() == null) {
			return MsgResponse400(msgRequest, "Tipo atualização obrigatório(a)");
		}
		else if (msgRequest.getMetadados() == null || msgRequest.getMetadados().isEmpty()) {
			  return MsgResponse400(msgRequest, "Metadados obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}
		
    @POST
    @Path("/v1/conteudo/excluirPorId")
    @Produces("application/json")
	public Object conteudo​ExcluirPorId(RequestExcluirPorId msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ExcluirPorId ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getId() == null) {
			return MsgResponse400(msgRequest, "Id obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}
	
    @POST
    @Path("/v1/conteudo/excluirPorNome")
    @Produces("application/json")
	public Object conteudo​ExcluirPorNome(RequestExcluirPorNome msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ExcluirPorNome ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getNome() == null) {
			return MsgResponse400(msgRequest, "Nome obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}

    @POST
    @Path("/v1/conteudo/excluirPorIdLogico")
    @Produces("application/json")
	public Object conteudo​ExcluirPorIdLogico(RequestExcluirPorIdLogico msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ExcluirPorIdLogico ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getId() == null) {
			return MsgResponse400(msgRequest, "Id obrigatório(a)");
		}
		else if (msgRequest.getClasseExclusaoConteudo() == null) {
			return MsgResponse400(msgRequest, "Classe Exclusão Conteúdo obrigatório(a)");
		}
		else if (msgRequest.getClasseExclusaoAssinatura() == null) {
			return MsgResponse400(msgRequest, "Classe Exclusão Assinatura obrigatório(a)");
		}
		else if (msgRequest.getNomeMetadadoStatusConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadados Status Conteudo obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}
	
    @POST
    @Path("/v1/conteudo/excluirPorNomeLogico")
    @Produces("application/json")
	public Object conteudo​ExcluirPorNomeLogico(RequestExcluirPorNomeLogico msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ExcluirPorNomeLogico ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getNome() == null) {
			return MsgResponse400(msgRequest, "Nome obrigatório(a)");
		}
		else if (msgRequest.getClasseExclusaoConteudo() == null) {
			return MsgResponse400(msgRequest, "Classe Exclusão Conteúdo obrigatório(a)");
		}
		else if (msgRequest.getClasseExclusaoAssinatura() == null) {
			return MsgResponse400(msgRequest, "Classe Exclusão Assinatura obrigatório(a)");
		}
		else if (msgRequest.getNomeMetadadoStatusConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadados Status Conteudo obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}
	
    @POST
    @Path("/v1/conteudo/reverterExclusaoLogicaPorNome")
    @Produces("application/json")
	public Object conteudo​ReverterExclusaoLogicaPorNome(RequestReverterExclusaoLogicaPorNome msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ReverterExclusaoLogicaPorNome ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getNome() == null) {
			return MsgResponse400(msgRequest, "Nome obrigatório(a)");
		}
		else if (msgRequest.getClasseAssinatura() == null) {
			return MsgResponse400(msgRequest, "Classe Assinatura obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}
	
    @POST
    @Path("/v1/conteudo/reverterExclusaoLogicaPorId")
    @Produces("application/json")
	public Object conteudo​ReverterExclusaoLogicaPorId(RequestReverterExclusaoLogicaPorId msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - conteudo​ReverterExclusaoLogicaPorId ###");
		if (msgRequest.getCentroCusto() == null) {
			return MsgResponse400(msgRequest, "Centro de Custo obrigatório(a)");
		}
		else if (msgRequest.getCanal() == null) {
			return MsgResponse400(msgRequest, "Canal obrigatório(a)");
		}
		else if (msgRequest.getUsuario() == null) {
			return MsgResponse400(msgRequest, "Usuário obrigatório(a)");
		}
		else if (msgRequest.getSenha() == null) {
			return MsgResponse400(msgRequest, "Senha obrigatório(a)");
		}
		else if (msgRequest.getObjectStore() == null) {
			return MsgResponse400(msgRequest, "Object Store obrigatório(a)");
		}
		else if (msgRequest.getId() == null) {
			return MsgResponse400(msgRequest, "Id obrigatório(a)");
		}
		else if (msgRequest.getChoiceList() == null) {
			return MsgResponse400(msgRequest, "Choicelist obrigatório(a)");
		}
		else if (msgRequest.getNomeMetadadoTipoConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadado Tipo obrigatório(a)");
		}
		else if (msgRequest.getNomeMetadadoStatusConteudo() == null) {
			return MsgResponse400(msgRequest, "Nome Metadado Status obrigatório(a)");
		}
		else if (msgRequest.getClasseAssinatura() == null) {
			return MsgResponse400(msgRequest, "Classe Assinatura obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}
	
    @POST
    @Path("/utils/converterArquivoBase64")
    @Produces("application/json")
	public Object utils​ConverterArquivoBase64(Object msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - utils​ConverterArquivoBase64 ###");
//		#################
//		### ZZZ###ZZZ ###
//		#################
//		curl -X POST "http://ecmweb.unitario.teste.bradesco.com.br/cgcc_integracao_conteudo/rest/utils/converterArquivoBase64" -H "accept: text/plain" -H "Content-Type: multipart/form-data" -F "arquivo=@CustomHealthIndicator.java"
		
		return MsgResponseBase200(msgRequest);
	}
    
//###########################################################################
// RESPOSTAS POSSÍVEIS	
//###########################################################################
 	private Object MsgResponseBase200(Object MsgRequest) {
 		Map<String, Object> msgResponse = new HashMap<>();
         msgResponse.put("status", Response.Status.OK.getStatusCode());
         msgResponse.put("mensagem", "OK");
 		return Response.status(Response.Status.OK).entity(msgResponse).build();
 	}

 	private Object MsgResponseBase200Arq(Object MsgRequest) {
		ResponseObter responseObter = new ResponseObter();
 		responseObter.setStatus(200);
 		responseObter.setMensagem("OK");
 		ArrayList<String> msgArrayList = new ArrayList<String>();
 		msgArrayList.add("arquivo1");
 		msgArrayList.add("arquivo2");
 		responseObter.setArquivos(msgArrayList);
 		Map<String, Object> msgResponse = new HashMap<>();
 		msgResponse.put("status", Response.Status.OK.getStatusCode());
        msgResponse.put("mensagem", "OK");
        msgResponse.put("arquivo", msgArrayList);
		return Response.status(Response.Status.OK).entity(msgResponse).build();

 	}

    private Object MsgResponseCriar201(Object MsgRequest) {
        Map<String, Object> msgResponse = new HashMap<>();
        msgResponse.put("status", Response.Status.CREATED.getStatusCode());
        msgResponse.put("mensagem", "OK");
        msgResponse.put("id", "ID");
		return Response.status(Response.Status.CREATED).entity(msgResponse).build();
 	}
 	
 	private Object MsgResponse400(Object MsgRequest, String Msg) {
 		Map<String, Object> msgResponse = new HashMap<>();
         msgResponse.put("status", Response.Status.BAD_REQUEST.getStatusCode());
         msgResponse.put("mensagem", Msg);
 		return Response.status(Response.Status.BAD_REQUEST).entity(msgResponse).build();
    }
 }

