package phuc.com.fa.demomvc.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import phuc.com.fa.demomvc.entity.Organisation;
import phuc.com.fa.demomvc.page.PageAble;
import phuc.com.fa.demomvc.service.OrganisationServiceImpl;
/* Inside the controller there will be many methods,
 * each of which will catch a specific request */
@Controller
public class HomeController {
    @Autowired
    OrganisationServiceImpl organisationServiceImpl;

    // Catch the GET request and return the view
    @RequestMapping(value = "/OrganisationDetail1", method = RequestMethod.GET)
    public String getOrgDe() {
        return "/OrganisationDetail1";
    }

    // Catch the GET request and return the view
    @RequestMapping(value = "/OrganisationDetail2", method = RequestMethod.GET)
    public String getOrgDe2() {
        return "/OrganisationDetail2";
    }

    // Catch the GET request and return the view
    @RequestMapping(value = "/OrganisationDetail3", method = RequestMethod.GET)
    public String getOrgDe3() {
        return "/OrganisationDetail3";
    }

    // Catch the POST request and return the view
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model, @RequestParam(name = "organisationName") String organisationName,
            @RequestParam(name = "phone") String phone, @RequestParam(name = "postCode") String postCode,
            @ModelAttribute Organisation organisation) {
        try {
            if (organisationServiceImpl.checkName(organisationName) == true) {
                model.addAttribute("fail", "Organisation already exists in the data");
                model.addAttribute("succesfully", "");
            } else {
                organisationServiceImpl.saveOrUpdate(organisation);
                organisation = new Organisation();
                model.addAttribute("organisation", organisation);
                model.addAttribute("succesfully", "Save organisation succesfully");
            }
            return "OrganisationDetail1";
        } catch (Exception e) {
            return "error";
        }
    }
    
    @RequestMapping(value = "/gg", method = RequestMethod.GET)
    public String create1(Model model, @RequestParam(name = "organisationName") String organisationName,
            @RequestParam(name = "phone") String phone, @RequestParam(name = "postCode") String postCode,
            @ModelAttribute Organisation organisation) {
        try {
            if (organisationServiceImpl.checkName(organisationName) == true) {
                model.addAttribute("fail", "Organisation already exists in the data");
                model.addAttribute("succesfully", "");
            } else {
                organisationServiceImpl.saveOrUpdate(organisation);
                organisation = new Organisation();
                model.addAttribute("organisation", organisation);
                model.addAttribute("succesfully", "Save organisation succesfully");
            }
            return "OrganisationDetail1";
        } catch (Exception e) {
            return "error";
        }
    }

    // Catch the GET request and return the view
    @RequestMapping(value = "/updateActive", method = RequestMethod.GET)
    public String updateActive(Model model, @RequestParam(name = "stt") String stt,@RequestParam(name = "checkme", required = false) String checkme) {
        long sttLong = Long.parseLong(stt);
        Organisation organisation = organisationServiceImpl.findById(sttLong);
        if (organisation != null) {
            organisationServiceImpl.updateActive(organisation);
            model.addAttribute("checkme", checkme);
        }
        return "redirect:/index";
    }
    
    // Catch the GET request and return the view
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String sort(Model model, @RequestParam(name = "checkme", required = false) String checkme,
    		@RequestParam(name = "page", defaultValue = "1") Integer page) {
    	List<Organisation> organisationList = null;
    	PageAble pageAble = new PageAble(page);
    	organisationList = organisationServiceImpl.sort(pageAble, checkme);
    	model.addAttribute("organisationList", organisationList);
    	model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "all"));
        model.addAttribute("currentPage", page);
        model.addAttribute("checkme", checkme);
        return "index";
    }

    // Catch the GET request and return the view
    @GetMapping("/")
    public String home() {
        return "redirect:/index";
    }

    // Catch the GET request and return the view
    @GetMapping("/{path}")
    public String filter(@RequestParam(name = "checkme", required = false) String checkme,
            @RequestParam(name = "page", defaultValue = "1") Integer page, @PathVariable String path, Model model) {
        PageAble pageAble = new PageAble(page);
        List<Organisation> organisationList = null;
        switch (path) {
        case "index":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "active");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "active"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "all");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "all"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "filer09":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "09active");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "09active"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "09all");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "09all"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "filerae":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "aeactive");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "aeactive"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "aeall");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "aeall"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "filerfj":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "fjactive");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "fjactive"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "fjall");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "fjall"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "filerkn":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "knactive");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "knactive"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "knall");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "knall"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "fileror":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "oractive");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "oractive"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "orall");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "orall"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "filersv":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "svactive");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "svactive"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "svall");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "svall"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "filerwz":
            if (checkme == null || "".equals(checkme)) {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "wzactive");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "wzactive"));
                model.addAttribute("currentPage", page);
            } else {
                organisationList = organisationServiceImpl.findWithPageAble(pageAble, "wzall");
                model.addAttribute("organisationList", organisationList);
                model.addAttribute("totalPages", organisationServiceImpl.totalPages(pageAble, "wzall"));
                model.addAttribute("currentPage", page);
                model.addAttribute("checkme", checkme);
            }
            break;
        case "error":
            return "error";
        default:
            break;
        }
        return "index";
    }
}
