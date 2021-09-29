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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh
 */
public class QlyHDVModify {

    public static List<QlyHDV> find(String TenHDV) {
        List<QlyHDV> aclist = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from QlyHDV where TenHDV like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + TenHDV + "%");

            ResultSet resulSet = statement.executeQuery();

            while (resulSet.next()) {
                QlyHDV qlyhdv = new QlyHDV(resulSet.getString("MaHDV"),
                        resulSet.getString("TenHDV"),
                        resulSet.getString("SdtHDV"),
                        resulSet.getString("DiachiHDV"),
                        resulSet.getInt("SoCmndHDV"),
                        resulSet.getString("NgayCap"),
                        resulSet.getString("NoiCap"),
                        resulSet.getString("NgaySinh"),
                        resulSet.getString("MagiaychungnhanHDV"),
                        resulSet.getString("NgaycapgiaychungnhanHDV"),
                        resulSet.getString("GhiChu")
                );

                aclist.add(qlyhdv);
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

    public static List<QlyHDV> findAll() {
        List<QlyHDV> aclist = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from QlyHDV";
            statement = connection.createStatement();

            ResultSet resulSet = statement.executeQuery(sql);

            while (resulSet.next()) {
                QlyHDV qlyhdv = new QlyHDV(resulSet.getString("MaHDV"),
                        resulSet.getString("TenHDV"),
                        resulSet.getString("SdtHDV"),
                        resulSet.getString("DiachiHDV"),
                        resulSet.getInt("SoCmndHDV"),
                        resulSet.getString("NgayCap"),
                        resulSet.getString("NoiCap"),
                        resulSet.getString("NgaySinh"),
                        resulSet.getString("MagiaychungnhanHDV"),
                        resulSet.getString("NgaycapgiaychungnhanHDV"),
                        resulSet.getString("GhiChu"));

                aclist.add(qlyhdv);
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

    public static void insert(QlyHDV acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "insert into QlyHDV(MaHDV, TenHDV, SdtHDV, DiachiHDV, SoCmndHDV, NgayCap, NoiCap, NgaySinh, MagiaychungnhanHDV, NgaycapgiaychungnhanHDV, GhiChu) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, acc.getMaHDV());
            statement.setString(2, acc.getTenHDV());
            statement.setString(3, acc.getSdtHDV());
            statement.setString(4, acc.getDiachiHDV());
            statement.setInt(5, acc.getSoCmndHDV());
            statement.setString(6, acc.getNgayCap());
            statement.setString(7, acc.getNoiCap());
            statement.setString(8, acc.getNgaySinh());
            statement.setString(9, acc.getMagiaychungnhanHDV());
            statement.setString(10, acc.getNgaycapgiaychungnhanHDV());
            statement.setString(11, acc.getGhiChu());

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

    public static void update(QlyHDV acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "update QlyHDV set TenHDV=?, SdtHDV=?, DiachiHDV=?, SoCmndHDV=?, NgayCap=? ,NoiCap=? , NgaySinh=?, MagiaychungnhanHDV=?, NgaycapgiaychungnhanHDV=?, GhiChu=? where MaHDV = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, acc.getTenHDV());
            statement.setString(2, acc.getSdtHDV());
            statement.setString(3, acc.getDiachiHDV());
            statement.setInt(4, acc.getSoCmndHDV());
            statement.setString(5, acc.getNgayCap());
            statement.setString(6, acc.getNoiCap());
            statement.setString(7, acc.getNgaySinh());
            statement.setString(8, acc.getMagiaychungnhanHDV());
            statement.setString(9, acc.getNgaycapgiaychungnhanHDV());
            statement.setString(10, acc.getGhiChu());
            statement.setString(11, acc.getMaHDV());

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

    public static void QlyHDV(String MaHDV) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "delete from QlyHDV where MaHDV = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, MaHDV);

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
