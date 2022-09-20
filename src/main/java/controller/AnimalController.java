package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class AnimalController {

    private Object fetchAnimalFacts;

    public AnimalController(){

}

@GetMapping({"/animal"})
    public String fetchAnimalById(){

    return "Capybara!!!";
}
    @GetMapping({"/animal/{id}"})

    public String fetchAnimalFacts(@PathVariable long id)
    {return fetchAnimalFacts.fakeAnimalFacts(id);}

        switch((int)id)

    static {

        case 1:
            String s = "Find the animals!!";

        case 2:
            String a = "mvjhgvjhgvjhgvjhgvhj";


        default:
            String s1 = "unknown animal";



    }


    }

