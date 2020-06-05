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
import cgcc.integracao.pastas.Pasta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Contempla o conteúdo a ser enviado na requisição de criação de estrutura de pastas no repositório GCC
 */
@ApiModel(description = "Contempla o conteúdo a ser enviado na requisição de criação de estrutura de pastas no repositório GCC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class RequestCriarEstruturaPasta {
  @SerializedName("centroCusto")
  private String centroCusto = null;

  @SerializedName("canal")
  private String canal = null;

  @SerializedName("usuario")
  private String usuario = null;

  @SerializedName("senha")
  private String senha = null;

  @SerializedName("objectStore")
  private String objectStore = null;

  @SerializedName("caminhoBase")
  private String caminhoBase = null;

  @SerializedName("criarOrdemDecrescente")
  private Boolean criarOrdemDecrescente = null;

  @SerializedName("pastas")
  private List<Pasta> pastas = new ArrayList<Pasta>();

  public RequestCriarEstruturaPasta centroCusto(String centroCusto) {
    this.centroCusto = centroCusto;
    return this;
  }

   /**
   * Centro de custo que esta executando a requisição
   * @return centroCusto
  **/
  @ApiModelProperty(required = true, value = "Centro de custo que esta executando a requisição")
  public String getCentroCusto() {
    return centroCusto;
  }

  public void setCentroCusto(String centroCusto) {
    this.centroCusto = centroCusto;
  }

  public RequestCriarEstruturaPasta canal(String canal) {
    this.canal = canal;
    return this;
  }

   /**
   * Canal que está executando a requisição
   * @return canal
  **/
  @ApiModelProperty(required = true, value = "Canal que está executando a requisição")
  public String getCanal() {
    return canal;
  }

  public void setCanal(String canal) {
    this.canal = canal;
  }

  public RequestCriarEstruturaPasta usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

   /**
   * Usuário para autenticação no repositório GCC (o usuário deve estar criptografado no padrão GCC)
   * @return usuario
  **/
  @ApiModelProperty(required = true, value = "Usuário para autenticação no repositório GCC (o usuário deve estar criptografado no padrão GCC)")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public RequestCriarEstruturaPasta senha(String senha) {
    this.senha = senha;
    return this;
  }

   /**
   * Senha para autenticação no repositório GCC (a senha deve estar criptografada no padrão GCC)
   * @return senha
  **/
  @ApiModelProperty(required = true, value = "Senha para autenticação no repositório GCC (a senha deve estar criptografada no padrão GCC)")
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public RequestCriarEstruturaPasta objectStore(String objectStore) {
    this.objectStore = objectStore;
    return this;
  }

   /**
   * ObjectStore onde será executada a operação no repositório
   * @return objectStore
  **/
  @ApiModelProperty(example = "OS-CAMBIO", required = true, value = "ObjectStore onde será executada a operação no repositório")
  public String getObjectStore() {
    return objectStore;
  }

  public void setObjectStore(String objectStore) {
    this.objectStore = objectStore;
  }

  public RequestCriarEstruturaPasta caminhoBase(String caminhoBase) {
    this.caminhoBase = caminhoBase;
    return this;
  }

   /**
   * Caminho da estrutura de pastas a partir do qual as demais pastas serão criadas
   * @return caminhoBase
  **/
  @ApiModelProperty(example = "/GCC/Abertura Conta/Processos", required = true, value = "Caminho da estrutura de pastas a partir do qual as demais pastas serão criadas")
  public String getCaminhoBase() {
    return caminhoBase;
  }

  public void setCaminhoBase(String caminhoBase) {
    this.caminhoBase = caminhoBase;
  }

  public RequestCriarEstruturaPasta criarOrdemDecrescente(Boolean criarOrdemDecrescente) {
    this.criarOrdemDecrescente = criarOrdemDecrescente;
    return this;
  }

   /**
   * Define se a criação das pastas deve ser efetuada do nível mais alto para o mais baixo. Indicado utilizar como TRUE quando a possibilidade dos primeiros níveis a serem criados já existirem.
   * @return criarOrdemDecrescente
  **/
  @ApiModelProperty(example = "false", required = true, value = "Define se a criação das pastas deve ser efetuada do nível mais alto para o mais baixo. Indicado utilizar como TRUE quando a possibilidade dos primeiros níveis a serem criados já existirem.")
  public Boolean isCriarOrdemDecrescente() {
    return criarOrdemDecrescente;
  }

  public void setCriarOrdemDecrescente(Boolean criarOrdemDecrescente) {
    this.criarOrdemDecrescente = criarOrdemDecrescente;
  }

  public RequestCriarEstruturaPasta pastas(List<Pasta> pastas) {
    this.pastas = pastas;
    return this;
  }

  public RequestCriarEstruturaPasta addPastasItem(Pasta pastasItem) {
    this.pastas.add(pastasItem);
    return this;
  }

   /**
   * Lista de pastas a serem criadas a partir do caminho base
   * @return pastas
  **/
  @ApiModelProperty(required = true, value = "Lista de pastas a serem criadas a partir do caminho base")
  public List<Pasta> getPastas() {
    return pastas;
  }

  public void setPastas(List<Pasta> pastas) {
    this.pastas = pastas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestCriarEstruturaPasta requestCriarEstruturaPasta = (RequestCriarEstruturaPasta) o;
    return Objects.equals(this.centroCusto, requestCriarEstruturaPasta.centroCusto) &&
        Objects.equals(this.canal, requestCriarEstruturaPasta.canal) &&
        Objects.equals(this.usuario, requestCriarEstruturaPasta.usuario) &&
        Objects.equals(this.senha, requestCriarEstruturaPasta.senha) &&
        Objects.equals(this.objectStore, requestCriarEstruturaPasta.objectStore) &&
        Objects.equals(this.caminhoBase, requestCriarEstruturaPasta.caminhoBase) &&
        Objects.equals(this.criarOrdemDecrescente, requestCriarEstruturaPasta.criarOrdemDecrescente) &&
        Objects.equals(this.pastas, requestCriarEstruturaPasta.pastas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(centroCusto, canal, usuario, senha, objectStore, caminhoBase, criarOrdemDecrescente, pastas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestCriarEstruturaPasta {\n");
    
    sb.append("    centroCusto: ").append(toIndentedString(centroCusto)).append("\n");
    sb.append("    canal: ").append(toIndentedString(canal)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    objectStore: ").append(toIndentedString(objectStore)).append("\n");
    sb.append("    caminhoBase: ").append(toIndentedString(caminhoBase)).append("\n");
    sb.append("    criarOrdemDecrescente: ").append(toIndentedString(criarOrdemDecrescente)).append("\n");
    sb.append("    pastas: ").append(toIndentedString(pastas)).append("\n");
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

