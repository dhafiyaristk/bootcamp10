package com.bangdhaf.bootcamp10.controller;

import com.bangdhaf.bootcamp10.model.DefaultResponse;
import com.bangdhaf.bootcamp10.model.LoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                              //data berupa json jadi terapkan restcontroller
@RequestMapping("/mahasiswa")                //requestmapping agar bisa dipanggil lewat url, disini urlnya /mahasiswa
public class MahasiswaController {

    /*
    untuk megaksesnya gunakan  ->  /mahasiswa/login
    */
    @PostMapping("/login")
    public DefaultResponse login(@RequestBody LoginDto loginDto){          //POST mengirim lewat body jadi gunakan requestbody
                                                                            // dan bisa nangkep LoginDto || kata setelah public,
        DefaultResponse df = new DefaultResponse();                         //itu yg akan dikembalikan
        df.setStatus(Boolean. TRUE);
        df.setMessage("Selamat Login Berhasil");

        return df;
    }

}
