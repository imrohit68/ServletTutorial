package com.example.Filter;

import java.sql.*;

public class UserDB {

    static Connection connect;
    public static void insertData (user st){
        try {
            connect = ConnectionAuthen.createC();

            String q = "insert into user(username,password) values(?,?)";

            PreparedStatement pstmt = connect.prepareStatement(q);

            pstmt.setString(1,st.getUser());
            pstmt.setString(2, st.getPass());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void deleteData (int id){
        try {
            connect = ConnectionAuthen.createC();

            String q = "DELETE FROM students WHERE sid=?";

            PreparedStatement pstmt = connect.prepareStatement(q);
            pstmt.setString(1, String.valueOf(id));
            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void AllStudents() {
        try {
            connect = ConnectionAuthen.createC();
            String q = "SELECT * FROM students";
            Statement stmt = connect.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while(set.next()){
                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println("Id: "+id);
                System.out.println("Name: "+name);
                System.out.println("Phone: "+phone);
                System.out.println("City: "+city);
                System.out.println("++++++++++++++++++++++++++++++");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
