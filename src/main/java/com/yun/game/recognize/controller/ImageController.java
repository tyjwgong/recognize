package com.yun.game.recognize.controller;

import com.yun.game.recognize.entity.ResultBody;
import com.yun.game.recognize.service.AuthService;
import com.yun.game.recognize.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @version 1.0.0
 * @Description
 * @author: gongjw1@lenovo.com
 * @create: 2020-04-04 11:19
 * @since 1.0.0
 **/
@RestController
@Slf4j
@RequestMapping("/image")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @Autowired
    private AuthService authService;

    @PostMapping("/reco")
    public ResultBody getLasDataByParam(@RequestParam String image) throws Exception {
        return ResultBody.success(imageService.recoImage());
    }

    //result:{"refresh_token":"25.eedd5f418c80ae10c6cdb3782ed748e3.315360000.1901528948.282335-19288575","expires_in":2592000,"session_key":"9mzdWuuVJB\/j9aXTIRpNakFLlZp5T44zEEgy3IUkD9W1zsr31NyxNQcFdHKaqg5xRjIits4mf1aOuISxxt6l\/4KAqNs75g==","access_token":"24.a7400938d9826ed68075d78d9a13c5b7.2592000.1588760948.282335-19288575","scope":"public vis-classify_dishes vis-classify_car brain_ocr_general_basic brain_ocr_webimage brain_all_scope vis-classify_animal vis-classify_plant brain_object_detect brain_realtime_logo brain_realtime_same_hq brain_dish_detect brain_car_detect brain_animal_classify brain_plant_classify brain_ingredient brain_ocr_handwriting brain_advanced_general_classify brain_custom_dish brain_poi_recognize brain_vehicle_detect brain_redwine brain_currency brain_vehicle_damage wise_adapt lebo_resource_base lightservice_public hetu_basic lightcms_map_poi kaidian_kaidian ApsMisTest_Test\u6743\u9650 vis-classify_flower lpq_\u5f00\u653e cop_helloScope ApsMis_fangdi_permission smartapp_snsapi_base iop_autocar oauth_tp_app smartapp_smart_game_openapi oauth_sessionkey smartapp_swanid_verify smartapp_opensource_openapi smartapp_opensource_recapi qatest_scope1 fake_face_detect_\u5f00\u653eScope vis-ocr_\u865a\u62df\u4eba\u7269\u52a9\u7406 idl-video_\u865a\u62df\u4eba\u7269\u52a9\u7406","session_secret":"8403e7fc9da6607082a2ef804cbe2480"}
    @GetMapping("/getAuth")
    public ResultBody getAuth() throws Exception {
        return ResultBody.success(authService.getAuth());
    }
}
