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
public class QlyTourBookingModify {

    public static List<QlyTourBooking> find(String Matour) {
        List<QlyTourBooking> aclist = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from QlyTourBooking where Matour like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + Matour + "%");

            ResultSet resulSet = statement.executeQuery();

            while (resulSet.next()) {
                QlyTourBooking acc = new QlyTourBooking(resulSet.getInt("IDQlyTour"),
                        resulSet.getString("MaKH"),
                        resulSet.getString("Matour"),
                        resulSet.getString("MaHDV"),
                        resulSet.getString("NgayDi"),
                        resulSet.getString("NgayVe"),
                        resulSet.getString("NgayDatTour"),
                        resulSet.getInt("TrangThaiTour"),
                        resulSet.getString("NgayThanhToan"),
                        resulSet.getFloat("GiaTour"),
                        resulSet.getInt("SoLuongNgay"),
                        resulSet.getString("GhiChu"), 1
                );

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

    public static List<QlyTourBooking> findAll() {
        List<QlyTourBooking> aclist = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from QlyTourBooking";
            statement = connection.createStatement();

            ResultSet resulSet = statement.executeQuery(sql);

            while (resulSet.next()) {
                QlyTourBooking acc = new QlyTourBooking(resulSet.getInt("IDQlyTour"),
                        resulSet.getString("MaKH"),
                        resulSet.getString("Matour"),
                        resulSet.getString("MaHDV"),
                        resulSet.getString("NgayDi"),
                        resulSet.getString("NgayVe"),
                        resulSet.getString("NgayDatTour"),
                        resulSet.getInt("TrangThaiTour"),
                        resulSet.getString("NgayThanhToan"),
                        resulSet.getFloat("GiaTour"),
                        resulSet.getInt("SoLuongNgay"),
                        resulSet.getString("GhiChu"), 1);

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

    public static void insert(QlyTourBooking acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            if (acc.flagCapnhatTourBooking == 0) {
                String sql = "insert into QlyTourBooking(MaKH, Matour, MaHDV, NgayDi, NgayVe, NgayDatTour, TrangThaiTour, NgayThanhToan, GiaTour, SoLuongNgay, GhiChu) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                statement = connection.prepareCall(sql);

                statement.setString(1, acc.getMaKH());
                statement.setString(2, acc.getMatour());
                statement.setString(3, acc.getMaHDV());
                statement.setString(4, acc.getNgayDi());
                statement.setString(5, acc.getNgayVe());
                statement.setString(6, acc.getNgayDatTour());
                statement.setInt(7, acc.getTrangThaiTour());
                statement.setString(8, acc.getNgayThanhToan());
                statement.setFloat(9, acc.getGiaTour());
                statement.setInt(10, acc.getSoLuongNgay());
                statement.setString(11, acc.getGhiChu());

                statement.execute();
            } else {
                String sql = "update QlyTourBooking set  Matour=?, MaHDV=?, NgayDi=?, NgayVe=?, NgayDatTour=?, TrangThaiTour=?, NgayThanhToan=?, GiaTour=?, SoLuongNgay=?, GhiChu=? where MaKH = ?";
                statement = connection.prepareCall(sql);

                statement.setString(1, acc.getMatour());
                statement.setString(2, acc.getMaHDV());
                statement.setString(3, acc.getNgayDi());
                statement.setString(4, acc.getNgayVe());
                statement.setString(5, acc.getNgayDatTour());
                statement.setInt(6, acc.getTrangThaiTour());
                statement.setString(7, acc.getNgayThanhToan());
                statement.setFloat(8, acc.getGiaTour());
                statement.setInt(9, acc.getSoLuongNgay());
                statement.setString(10, acc.getGhiChu());
                statement.setString(11, acc.getMaKH());

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

    public static void delete(int IDQlyTour) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "delete from QlyTourBooking where IDQlyTour = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, IDQlyTour);

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
