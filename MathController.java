package springvalid;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
//(ModelAttribute,RequestMapping,RequestMethod,SessionAttributes)
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/doMath")
public class MathController {
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView calculateSum(@RequestParam("a") int a, @RequestParam("b") int b) {
		ModelAndView model=new ModelAndView("MathResult");
		
		model.addObject("sum",(a+b));
		model.addObject("subtract",(a-b));
		model.addObject("multiply",(a*b));
		model.addObject("divide",(a/b));
		return model;
	}
	
}
