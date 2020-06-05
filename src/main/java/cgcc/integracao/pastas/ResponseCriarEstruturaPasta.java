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
import java.io.IOException;

/**
 * Contempla as informações retornadas como resultado da execução da criação de estrutura de pastas
 */
@ApiModel(description = "Contempla as informações retornadas como resultado da execução da criação de estrutura de pastas")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class ResponseCriarEstruturaPasta {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("mensagem")
  private String mensagem = null;

  @SerializedName("caminhoPasta")
  private String caminhoPasta = null;

  public ResponseCriarEstruturaPasta status(Integer status) {
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

  public ResponseCriarEstruturaPasta mensagem(String mensagem) {
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

  public ResponseCriarEstruturaPasta caminhoPasta(String caminhoPasta) {
    this.caminhoPasta = caminhoPasta;
    return this;
  }

   /**
   * Caminho da estrutura de pastas criada
   * @return caminhoPasta
  **/
  @ApiModelProperty(value = "Caminho da estrutura de pastas criada")
  public String getCaminhoPasta() {
    return caminhoPasta;
  }

  public void setCaminhoPasta(String caminhoPasta) {
    this.caminhoPasta = caminhoPasta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCriarEstruturaPasta responseCriarEstruturaPasta = (ResponseCriarEstruturaPasta) o;
    return Objects.equals(this.status, responseCriarEstruturaPasta.status) &&
        Objects.equals(this.mensagem, responseCriarEstruturaPasta.mensagem) &&
        Objects.equals(this.caminhoPasta, responseCriarEstruturaPasta.caminhoPasta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mensagem, caminhoPasta);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCriarEstruturaPasta {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    caminhoPasta: ").append(toIndentedString(caminhoPasta)).append("\n");
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

