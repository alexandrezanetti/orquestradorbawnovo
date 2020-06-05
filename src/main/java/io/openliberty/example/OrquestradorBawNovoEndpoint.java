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
import cgcc.integracao.conteudo.RequestCriar;
import cgcc.integracao.conteudo.ResponseObter;

@Path("/cgcc_integracao_conteudo/rest")
public class OrquestradorBawNovoEndpoint{
    private static final String template = "Hello, ZZZZZZZZZZZZZZZZZZZZZ %s!";

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
	public Object criarUnfiled(RequestCriar msgRequest) {
		System.out.println("### OrquestradorBawNovoEndpoint - criarUnfiled ###");
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
			return MsgResponseBase200(msgRequest);
		}
    }

    @POST
    @Path("/v1/conteudo/criar")
    @Produces("application/json")
	public Object conteudo​Criar(RequestCriar msgRequest) {
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

