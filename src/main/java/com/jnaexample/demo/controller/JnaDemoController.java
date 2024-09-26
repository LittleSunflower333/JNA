package com.jnaexample.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.jnaexample.demo.HivisionIDphotosLibrary;
import com.jnaexample.demo.JnaLibrary;
import com.jnaexample.demo.entity.Hivision_java_params;
import org.springframework.web.bind.annotation.*;

import java.io.SyncFailedException;

@RestController
@RequestMapping("/JNA")
public class JnaDemoController {
    @GetMapping("/add")
    public int add(@RequestParam("a") int a ,@RequestParam("b") int b){
        int result = HivisionIDphotosLibrary.INSTANCE.add(a,b);
        return result;
    }
    @GetMapping("/human_mating")
    public String human_mating(@RequestParam("hivision_java_params_json") String hivision_java_params_json){
        try{
            Hivision_java_params hivision_java_params = JSONObject.parseObject(hivision_java_params_json, Hivision_java_params.class);
//            Hivision_java_params hivision_java_params = new Hivision_java_params();
//            hivision_java_params.setModel_path("src\\main\\resources\\model\\mnn_hivision_modnet.mnn");
//            hivision_java_params.setImage_path("src\\main\\resources\\face_image\\Trump.jpg");
//            hivision_java_params.setOut_path("src\\main\\resources\\target\\");
//            hivision_java_params.setFace_model_path("src\\main\\resources\\model\\");
            HivisionIDphotosLibrary.INSTANCE.human_mating(hivision_java_params);
            return "success";
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "fail";
        }
    }
    @GetMapping("/ID_photo")
    public String ID_photo(@RequestParam("hivision_java_params_json") String hivision_java_params_json,
                           @RequestParam("out_size_kb")int out_size_kb,@RequestParam("layout_phot")boolean layout_phot){
        try{
            Hivision_java_params hivision_java_params = JSONObject.parseObject(hivision_java_params_json, Hivision_java_params.class);
//            Hivision_java_params hivision_java_params = new Hivision_java_params();
//            hivision_java_params.setModel_path("src\\main\\resources\\model\\mnn_hivision_modnet.mnn");
//            hivision_java_params.setImage_path("src\\main\\resources\\face_image\\Trump.jpg");
//            hivision_java_params.setOut_path("src\\main\\resources\\target\\");
//            hivision_java_params.setFace_model_path("src\\main\\resources\\model\\");
            int i = HivisionIDphotosLibrary.INSTANCE.ID_photo(hivision_java_params,out_size_kb,layout_phot);
            if(i==1) {
                return "success";
            } else {return"fail";}
        }catch (Exception e){
            System.out.println(e.getMessage());
            return"fail";
        }
    }

}
