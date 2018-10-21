package ru.itcave.coins_base.repository;

import org.springframework.data.repository.CrudRepository;
import ru.itcave.coins_base.model.Coin;

public interface CoinRepository extends CrudRepository<Coin,Long> {

}
