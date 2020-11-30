package Form.Handlling.form.handling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("input", new Input());
        return "index";
    }

    @PostMapping
    public String save(Input input, Model model) {
        model.addAttribute("input", input);
        return "saved";
    }
}