package ts.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ts.service.QueryService;

@Controller
public class QueryAction {

	public QueryService queryService;

	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";

	}

	@RequestMapping("/execService")
	public String execService() throws Exception {
		queryService.inserCity("Taipei16", "TWN", "GENM", 56565);
		return "index";
	}

	@RequestMapping("/execSearch")
	public String execSearch() {
		queryService.searchCityByExample("Taipei16");
		return "index";
	}
	
}
