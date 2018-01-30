package com.dgut.service;

import java.util.List;

import com.dgut.entity.Favorite;
import com.dgut.entity.FavoriteExample;

public interface FavoriteService extends BaseService<Favorite, FavoriteExample>{

	List<Favorite> selectAllFavorite(Integer id);

}
