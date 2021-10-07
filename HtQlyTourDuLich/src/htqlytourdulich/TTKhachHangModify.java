/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh
 */
public class TTKhachHangModify {

    public static List<TTKhachHang> find(String TenKH) {
        List<TTKhachHang> aclist = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "Select [MaKH],[TenKH],[SdtKH],[Email],[DiachiKH], CONVERT(varchar, [NgaySinh], 103) as NgaySinh from[dbo].[TTKhachHang] where TenKH like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + TenKH + "%");

            ResultSet resulSet = statement.executeQuery();

            while (resulSet.next()) {
                TTKhachHang acc = new TTKhachHang(resulSet.getString("MaKH"),
                        resulSet.getString("TenKH"),
                        resulSet.getString("SdtKH"),
                        resulSet.getString("Email"),
                        resulSet.getString("DiachiKH"),
                        resulSet.getString("NgaySinh"), 1);

                aclist.add(acc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
        return aclist;
    }

    public static List<TTKhachHang> findAll() {
        List<TTKhachHang> aclist = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "Select [MaKH],[TenKH],[SdtKH],[Email],[DiachiKH], CONVERT(varchar, [NgaySinh], 103) as NgaySinh from[dbo].[TTKhachHang]";
            statement = connection.createStatement();

            ResultSet resulSet = statement.executeQuery(sql);

            while (resulSet.next()) {

                TTKhachHang acc = new TTKhachHang(resulSet.getString("MaKH"),
                        resulSet.getString("TenKH"),
                        resulSet.getString("SdtKH"),
                        resulSet.getString("Email"),
                        resulSet.getString("DiachiKH"),
                        resulSet.getString("NgaySinh"), 1);

                aclist.add(acc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
        return aclist;
    }

    public static void insert(TTKhachHang acc) throws ParseException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            SimpleDateFormat newDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date myDate = newDateFormat.parse(acc.getNgaySinh());
            newDateFormat.applyPattern("yyyy/MM/dd");
            String myDateString = newDateFormat.format(myDate);

            if (acc.flagCapnhatDN == 0) {
                String sql = "insert into TTKhachHang(MaKH, TenKH, SdtKH, Email, DiachiKH, NgaySinh) values(?, ?, ?, ?, ?, ?)";
                statement = connection.prepareCall(sql);

                statement.setString(1, acc.getMaKH());
                statement.setString(2, acc.getTenKH());
                statement.setString(3, acc.getSdtKH());
                statement.setString(4, acc.getEmail());
                statement.setString(5, acc.getDiachiKH());
                statement.setString(6, myDateString);

                statement.execute();
            } else {
                String sql = "update TTKhachHang set TenKH=?, SdtKH=?, Email=?, DiachiKH=?, NgaySinh=? where MaKH = ?";
                statement = connection.prepareCall(sql);

                statement.setString(1, acc.getTenKH());
                statement.setString(2, acc.getSdtKH());
                statement.setString(3, acc.getEmail());
                statement.setString(4, acc.getDiachiKH());
                statement.setString(5, acc.getNgaySinh());
                statement.setString(6, acc.getMaKH());

                statement.execute();
            }

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
    }

    public static void delete(String MaKH) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "delete from TTKhachHang where MaKH = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaKH);

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        //end
    }
}
