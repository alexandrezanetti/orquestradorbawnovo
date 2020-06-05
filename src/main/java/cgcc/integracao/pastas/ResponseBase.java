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
 * Contempla as informações básicas que devem ser retornadas após uma requisição
 */
@ApiModel(description = "Contempla as informações básicas que devem ser retornadas após uma requisição")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class ResponseBase {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("mensagem")
  private String mensagem = null;

  public ResponseBase status(Integer status) {
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

  public ResponseBase mensagem(String mensagem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBase responseBase = (ResponseBase) o;
    return Objects.equals(this.status, responseBase.status) &&
        Objects.equals(this.mensagem, responseBase.mensagem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, mensagem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBase {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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

