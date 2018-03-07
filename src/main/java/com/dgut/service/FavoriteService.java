package com.dgut.service;

import com.dgut.entity.Favorite;
import com.dgut.entity.FavoriteExample;

import java.util.List;

public interface FavoriteService extends BaseService<Favorite, FavoriteExample>{

	List<Favorite> selectAllFavorite(Integer id);

    boolean checkExist(Integer id, Integer teacherId);
}
