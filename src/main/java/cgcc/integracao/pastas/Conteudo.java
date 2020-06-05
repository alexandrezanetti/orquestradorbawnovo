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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contempla informações referentes a um conteúdo armazenado no repositório GCC
 */
@ApiModel(description = "Contempla informações referentes a um conteúdo armazenado no repositório GCC")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-05T16:43:43.593Z")
public class Conteudo {
  @SerializedName("urlWorkplaceViewer")
  private String urlWorkplaceViewer = null;

  @SerializedName("urlGccnViewer")
  private String urlGccnViewer = null;

  @SerializedName("urlObterConteudo")
  private String urlObterConteudo = null;

  @SerializedName("titulo")
  private String titulo = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("dataCriacao")
  private String dataCriacao = null;

  @SerializedName("metadados")
  private Map<String, Object> metadados = null;

  public Conteudo urlWorkplaceViewer(String urlWorkplaceViewer) {
    this.urlWorkplaceViewer = urlWorkplaceViewer;
    return this;
  }

   /**
   * URL para visulizar o conteúdo através do visualizador do WorkplaceXT
   * @return urlWorkplaceViewer
  **/
  @ApiModelProperty(value = "URL para visulizar o conteúdo através do visualizador do WorkplaceXT")
  public String getUrlWorkplaceViewer() {
    return urlWorkplaceViewer;
  }

  public void setUrlWorkplaceViewer(String urlWorkplaceViewer) {
    this.urlWorkplaceViewer = urlWorkplaceViewer;
  }

  public Conteudo urlGccnViewer(String urlGccnViewer) {
    this.urlGccnViewer = urlGccnViewer;
    return this;
  }

   /**
   * URL para visulizar o conteúdo através do Gccn Viewer
   * @return urlGccnViewer
  **/
  @ApiModelProperty(value = "URL para visulizar o conteúdo através do Gccn Viewer")
  public String getUrlGccnViewer() {
    return urlGccnViewer;
  }

  public void setUrlGccnViewer(String urlGccnViewer) {
    this.urlGccnViewer = urlGccnViewer;
  }

  public Conteudo urlObterConteudo(String urlObterConteudo) {
    this.urlObterConteudo = urlObterConteudo;
    return this;
  }

   /**
   * URL para obter os arquivos do conteúdo através de uma requisição GET
   * @return urlObterConteudo
  **/
  @ApiModelProperty(value = "URL para obter os arquivos do conteúdo através de uma requisição GET")
  public String getUrlObterConteudo() {
    return urlObterConteudo;
  }

  public void setUrlObterConteudo(String urlObterConteudo) {
    this.urlObterConteudo = urlObterConteudo;
  }

  public Conteudo titulo(String titulo) {
    this.titulo = titulo;
    return this;
  }

   /**
   * Titulo do conteúdo
   * @return titulo
  **/
  @ApiModelProperty(value = "Titulo do conteúdo")
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Conteudo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID do conteúdo no repositório
   * @return id
  **/
  @ApiModelProperty(value = "ID do conteúdo no repositório")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Conteudo dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

   /**
   * Data de criação do conteúdo no repositório
   * @return dataCriacao
  **/
  @ApiModelProperty(value = "Data de criação do conteúdo no repositório")
  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Conteudo metadados(Map<String, Object> metadados) {
    this.metadados = metadados;
    return this;
  }

  public Conteudo putMetadadosItem(String key, Object metadadosItem) {
    if (this.metadados == null) {
      this.metadados = new HashMap<String, Object>();
    }
    this.metadados.put(key, metadadosItem);
    return this;
  }

   /**
   * Mapa dos metadados solicitados para retorno. Caso o conteúdo não possua um metadado entre os que foram requisitados, será retornado null
   * @return metadados
  **/
  @ApiModelProperty(value = "Mapa dos metadados solicitados para retorno. Caso o conteúdo não possua um metadado entre os que foram requisitados, será retornado null")
  public Map<String, Object> getMetadados() {
    return metadados;
  }

  public void setMetadados(Map<String, Object> metadados) {
    this.metadados = metadados;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conteudo conteudo = (Conteudo) o;
    return Objects.equals(this.urlWorkplaceViewer, conteudo.urlWorkplaceViewer) &&
        Objects.equals(this.urlGccnViewer, conteudo.urlGccnViewer) &&
        Objects.equals(this.urlObterConteudo, conteudo.urlObterConteudo) &&
        Objects.equals(this.titulo, conteudo.titulo) &&
        Objects.equals(this.id, conteudo.id) &&
        Objects.equals(this.dataCriacao, conteudo.dataCriacao) &&
        Objects.equals(this.metadados, conteudo.metadados);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlWorkplaceViewer, urlGccnViewer, urlObterConteudo, titulo, id, dataCriacao, metadados);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conteudo {\n");
    
    sb.append("    urlWorkplaceViewer: ").append(toIndentedString(urlWorkplaceViewer)).append("\n");
    sb.append("    urlGccnViewer: ").append(toIndentedString(urlGccnViewer)).append("\n");
    sb.append("    urlObterConteudo: ").append(toIndentedString(urlObterConteudo)).append("\n");
    sb.append("    titulo: ").append(toIndentedString(titulo)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    metadados: ").append(toIndentedString(metadados)).append("\n");
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

