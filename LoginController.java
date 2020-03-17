package springvalid;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
//(ModelAttribute,RequestMapping,RequestMethod,SessionAttributes)
import org.springframework.web.servlet.ModelAndView;
import springvalid.*;
@Controller
public class LoginController 
{
@RequestMapping(value="displayForm",method=RequestMethod.GET)
public String HelloWorld(UserDetails ud)
{
	return "loginPage";
}
@RequestMapping("/login")
public String loginCheck(@Valid UserDetails userDetails,BindingResult result, ModelMap model)
{
	if(result.hasErrors())
	{
		return "loginPage";
	}
	else {
		model.addAttribute("lfobj",userDetails);
		return "success";
	}
}
}
