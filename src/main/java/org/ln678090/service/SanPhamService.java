package org.ln678090.service;

import org.ln678090.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private static List<SanPham> sanPhamList =new ArrayList<>();

    public  List<SanPham> getAll(){
        return sanPhamList;
    }
    public  void addSanPham(SanPham sanPham){
       try {
           if(
                   sanPham.getTen() != null &&
                           sanPham.getMoTa() != null
           ){
               sanPhamList.add(sanPham);
System.out.println("add");
           } else throw new IllegalArgumentException("Ten va Mo ta phai khac null");
       }
       catch(Exception e){
           throw new IllegalArgumentException("Ten va Mo ta phai khac null");
       }
    }
    public  void removeSanPham(Integer id){
        sanPhamList.removeIf(sanPham -> sanPham.getIdSP() == id);
    }
    public  SanPham upadateSanPham(SanPham sanPham){
//        int index = sanPhamList.indexOf(sanPham);
//        if(index != -1){
//            return  sanPhamList.set(index, sanPham);
//        }
//        return null;
        SanPham pham = new SanPham();
      for(SanPham sanPham1:sanPhamList){
        if(sanPham1.getIdSP()==sanPham.getIdSP()){
            sanPham1.setTen(sanPham.getTen());
            sanPham1.setSoLuong(sanPham.getSoLuong());
            sanPham1.setDonGia(sanPham.getDonGia());
            sanPham1.setMoTa(sanPham.getMoTa());
            pham=sanPham1;
        }
      }
      return pham;
    }


}
