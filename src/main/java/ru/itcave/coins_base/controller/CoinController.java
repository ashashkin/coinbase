package ru.itcave.coins_base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.itcave.coins_base.model.Coin;
import ru.itcave.coins_base.service.CoinService;

import java.util.List;

@Controller
@RequestMapping(value = "/coin")
public class CoinController {

    @Autowired
    CoinService coinService;

    @GetMapping(value = "/list")
    public ModelAndView list() {
        ModelAndView model = new ModelAndView("coin_list");
        List<Coin> coinList = coinService.getAllCoins();
        model.addObject("coinList",coinList);
        return model;
    }

    @GetMapping(value = "/add_coin")
    public ModelAndView addCoin() {
        ModelAndView model = new ModelAndView();
        Coin coin = new Coin();
        model.addObject("coinForm",coin);
        model.setViewName("coin_form");
        return model;
    }

    @GetMapping(value = "/edit_coin/{id}")
    public ModelAndView editCoin(@PathVariable long id) {
        ModelAndView model = new ModelAndView();
        Coin coin = coinService.getCoinById(id);
        model.addObject("coinForm",coin);
        model.setViewName("coin_form");
        return model;
    }

    @PostMapping(value = "/save_coin")
    public ModelAndView save(@ModelAttribute("coinForm") Coin coin){
        coinService.saveOrUpdate(coin);
        return new ModelAndView("redirect:/coin/list");
    }

    @GetMapping(value = "/delete_coin/{id}")
    public ModelAndView delete(@PathVariable long id){
        coinService.deleteCoin(id);
        return new ModelAndView("redirect:/coin/list");
    }

}
