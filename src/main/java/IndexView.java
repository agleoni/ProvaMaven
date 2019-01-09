import org.apache.jena.ontology.OntModel;
import org.apache.jena.rdf.model.ModelFactory;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class IndexView {

	private String stateMessage = "Processing...";

	public String getStateMessage() {
		return stateMessage;
	}

	public void setStateMessage(String stateMessage){
		this.stateMessage = stateMessage;
	}

	@PostConstruct
	public void init(){

		//Commenting the line below everything work
		OntModel model = ModelFactory.createOntologyModel();

		this.stateMessage = "init";

	}
}
