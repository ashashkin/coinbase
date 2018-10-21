package ru.itcave.coins_base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itcave.coins_base.model.Coin;
import ru.itcave.coins_base.repository.CoinRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CoinServiceImpl implements CoinService {

    @Autowired
    CoinRepository coinRepository;

    @Override
    public List<Coin> getAllCoins() {
        return (List<Coin>) coinRepository.findAll();
    }

    @Override
    public Coin getCoinById(long id) {
        return coinRepository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Coin coin) {
        coinRepository.save(coin);
    }

    @Override
    public void deleteCoin(long id) {
        coinRepository.deleteById(id);
    }
}
