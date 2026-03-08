package org.ln678090.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ln678090.entity.SanPham;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
@BeforeAll
static void setupall(){

}
SanPhamService sanPhamService;
    @BeforeEach
    void setUp() {
    sanPhamService = new SanPhamService();
        sanPhamService.getAll().clear();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {
    }

    @Test
    void addSanPham() {

        SanPham sanPham=new SanPham(1,"ten1",2,1200.7,"mo ta")  ;
        sanPhamService.addSanPham(sanPham);
        assertEquals(1,sanPhamService.getAll().size());

}

    @Test
    void removeSanPham() {
       addSanPham();
        sanPhamService.removeSanPham(1);
        assertEquals(0,sanPhamService.getAll().size());
    }

    @Test
    void upadateSanPham() {
      addSanPham();
        SanPham sanPham2=new SanPham(1,"ten2",3,1500.7,"mo ta2")  ;
       SanPham result = sanPhamService.upadateSanPham(sanPham2);



                    assertEquals("ten2", result.getTen());
                    assertEquals(3, result.getSoLuong());
                    assertEquals(1500.7, result.getDonGia());
                    assertEquals("mo ta2", result.getMoTa());


    }
    @Test
    void add(){
       String exx=assertThrows(IllegalArgumentException.class, ()->{
           SanPham sanPham=new SanPham(1,null,2,1200.7,"mo ta")  ;
           sanPhamService.addSanPham(sanPham);
       }).getMessage();
       assertEquals("Ten va Mo ta phai khac null",exx);
    }
}
// error: src refspec main does not match any