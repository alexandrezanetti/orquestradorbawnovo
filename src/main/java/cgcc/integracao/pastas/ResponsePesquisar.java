package cgcc.integracao.pastas;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import cgcc.integracao.pastas.Conteudo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contempla as informações retornadas como resultado da execução da pesquisa por conteúdos associados a uma pasta
 */
@ApiModel(description = "Contempla as informações retornadas como resultado da execução da pesquisa por conteúdos associados a uma pasta")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class ResponsePesquisar {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("mensagem")
  private String mensagem = null;

  @SerializedName("listaConteudo")
  private List<Conteudo> listaConteudo = null;

  public ResponsePesquisar status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status HTTP
   * @return status
  **/
  @ApiModelProperty(value = "Status HTTP")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ResponsePesquisar mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

   /**
   * Mensagem de retorno
   * @return mensagem
  **/
  @ApiModelProperty(value = "Mensagem de retorno")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public ResponsePesquisar listaConteudo(List<Conteudo> listaConteudo) {
    this.listaConteudo = listaConteudo;
    return this;
  }

  public ResponsePesquisar addListaConteudoItem(Conteudo listaConteudoItem) {
    if (this.listaConteudo == null) {
      this.listaConteudo = new ArrayList<Conteudo>();
    }
    this.listaConteudo.add(listaConteudoItem);
    return this;
  }

   /**
   * Lista com os conteudos associados a pasta informada
   * @return listaConteudo
  **/
  @ApiModelProperty(value = "Lista com os conteudos associados a pasta informada")
  public List<Conteudo> getListaConteudo() {
    return listaConteudo;
  }

  public void setListaConteudo(List<Conteudo> listaConteudo) {
    this.listaConteudo = listaConteudo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePesquisar responsePesquisar = (ResponsePesquisar) o;
    return Objects.equals(this.status, responsePesquisar.status) &&
        Objects.equals(this.mensagem, responsePesquisar.mensagem) &&
        Objects.equals(this.listaConteudo, responsePesquisar.listaConteudo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mensagem, listaConteudo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePesquisar {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    listaConteudo: ").append(toIndentedString(listaConteudo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

