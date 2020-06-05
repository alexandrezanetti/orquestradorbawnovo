package io.openliberty.example;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import cgcc.integracao.pastas.RequestAssociarDesassociarMassivo;
import cgcc.integracao.pastas.RequestAssociarDocumento;
import cgcc.integracao.pastas.RequestCriarEstruturaPasta;
import cgcc.integracao.pastas.RequestExcluir;
import cgcc.integracao.pastas.RequestPesquisar;
import cgcc.integracao.pastas.ResponseBase;
import cgcc.integracao.pastas.ResponseCriarEstruturaPasta;

@Path("/cgcc_integracao_pastas/rest")
public class CgccIntegracaoPastas{

	@POST
    @Path("/v1/pastas/criarEstrutura")
    @Produces("application/json")
	public Object pastasCriarEstrutura(RequestCriarEstruturaPasta msgRequest) {
		System.out.println("### CgccIntegracaoPastas - pastasCriarEstrutura ###");
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
		else if (msgRequest.getCaminhoBase() == null) {
			return MsgResponse400(msgRequest, "Caminho Base obrigatório(a)");
		}
		else if (msgRequest.isCriarOrdemDecrescente() == null ) {
			return MsgResponse400(msgRequest, "Criar Caminho Ordem Descrescente obrigatório(a)");
		}
		else if (msgRequest.getPastas() == null || msgRequest.getPastas().isEmpty()) {
			return MsgResponse400(msgRequest, "Pastas obrigatório(a)");
		}
		else
		{
			return MsgResponseCriarEstruturaPasta201(msgRequest);
		}
    }
	
    @POST
    @Path("/v1/pastas/associarConteudo")
    @Produces("application/json")
	public Object pastasAssociarConteudo(RequestAssociarDocumento msgRequest) {
		System.out.println("### CgccIntegracaoPastas - pastasAssociarConteudo ###");
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
		else if (msgRequest.getIdConteudo() == null) {
			return MsgResponse400(msgRequest, "Id Conteúdo obrigatório(a)");
		}
		else if (msgRequest.getCaminhoPasta() == null) {
			return MsgResponse400(msgRequest, "Caminho Pasta obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
    }

    
    @POST
    @Path("/v1/pastas/pesquisarPorPasta")
    @Produces("application/json")
	public Object pastasPesquisarPorPasta(RequestPesquisar msgRequest) {
		System.out.println("### CgccIntegracaoPastas - pastasPesquisarPorPasta ###");
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
		else if (msgRequest.getCaminhoPasta() == null) {
			return MsgResponse400(msgRequest, "Caminho Pasta obrigatório(a)");
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
	@Path("/v1​/pastas​/excluirPasta")
	@Produces("application/json")
	public Object pastasExcluirPasta(RequestExcluir msgRequest) {
		System.out.println("### CgccIntegracaoPastas - pastasExcluirPasta ###");
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
		else if (msgRequest.getCaminho() == null) {
			return MsgResponse400(msgRequest, "Caminho obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}

	@POST
	@Path("/v1/pastas/associarDesassociarMassivo")
	@Produces("application/json")
	public Object pastasAssociarDesassociarMassivo(RequestAssociarDesassociarMassivo msgRequest) {
		System.out.println("### CgccIntegracaoPastas - pastasAssociarDesassociarMassivo ###");
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
		else if (msgRequest.getCaminhoOrigem() == null) {
			return MsgResponse400(msgRequest, "Caminho Origem obrigatório(a)");
		}
		else if (msgRequest.getCaminhoDestino() == null) {
			return MsgResponse400(msgRequest, "Caminho Destino obrigatório(a)");
		}
		else
		{
			return MsgResponseBase200(msgRequest);
		}
	}

  //###########################################################################
  // RESPOSTAS POSSÍVEIS	
  //###########################################################################
   	private Object MsgResponseBase200(Object MsgRequest) {
   		ResponseBase msgResponse = new ResponseBase(); 
          msgResponse.setStatus(Response.Status.OK.getStatusCode());
          msgResponse.setMensagem("OK");
   		return Response.status(Response.Status.OK).entity(msgResponse).build();
   	}

      private Object MsgResponseCriarEstruturaPasta201(Object MsgRequest) {
    	  ResponseCriarEstruturaPasta msgResponse = new ResponseCriarEstruturaPasta();
          msgResponse.setStatus(Response.Status.CREATED.getStatusCode());
          msgResponse.setMensagem("OK");
          msgResponse.setCaminhoPasta("caminhoPasta");
  		return Response.status(Response.Status.CREATED).entity(msgResponse).build();
   	}
   	
   	private Object MsgResponse400(Object MsgRequest, String Msg) {
   		ResponseBase msgResponse = new ResponseBase();
          msgResponse.setStatus(Response.Status.BAD_REQUEST.getStatusCode());
          msgResponse.setMensagem(Msg);
   		return Response.status(Response.Status.BAD_REQUEST).entity(msgResponse).build();
      }
   }

