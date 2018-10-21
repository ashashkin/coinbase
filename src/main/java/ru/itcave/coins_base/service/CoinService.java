package ru.itcave.coins_base.service;

import ru.itcave.coins_base.model.Coin;

import java.util.List;

public interface CoinService {

    public List<Coin> getAllCoins();

    public Coin getCoinById(long id);

    public void saveOrUpdate(Coin coin);

    public void deleteCoin(long id);
}
