package com.jram.Dao;

import java.util.List;

public interface CrudDao<T> {

    public List<T> findAll();

    public List<T> findById(int codigo);
    
    public boolean Save(T t);

    public boolean Update(T t);

    public boolean Delete(int t);

    public int Exists(int t);
}


/*

SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
Date parsedDate = dateFormat.parse(request.getParameter("textBoxName"));
Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());

preparedStatement.setTimestamp(1, timestamp);//1 is the index of parameter you can choose named parameters too


*/