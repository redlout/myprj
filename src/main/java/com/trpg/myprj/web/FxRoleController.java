package com.trpg.myprj.web;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import com.trpg.myprj.entity.FxRole;
import com.trpg.myprj.service.FxRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fxrole")
public class FxRoleController {
    @Autowired
    private FxRoleService fxRoleService;

    @RequestMapping(value = "/listfxrole", method = RequestMethod.GET)
    private Map<String, Object> listFxRole(){
        Map<String, Object> modelMap = new HashMap<>();
        List<FxRole> list = fxRoleService.getFxRoleList();
        modelMap.put("fxRoleList", list);
        return modelMap;
    }
    @RequestMapping(value = "/getfxrolebyname", method = RequestMethod.GET)
    private Map<String, Object> getFxRoleByName(String fxRoleName){
        Map<String, Object> modelMap = new HashMap<>();
        FxRole fxRole = fxRoleService.getFxRoleByName(fxRoleName);
        modelMap.put("fxRole", fxRole);
        return modelMap;
    }

    @CrossOrigin
    @RequestMapping(value = "/addfxrole", method = RequestMethod.POST)
    private Map<String, Object> addFxRole(@RequestBody Map<String, Object> fxRoleMap, HttpServletRequest request){
        FxRole fxRole = new FxRole();
        Map<String, Object> modelMap = new HashMap<>();
        Map<String, Object> fx1 = (Map) fxRoleMap.get("fx1");
        List<Map<String, Object>> fx2 = (List<Map<String, Object>>) fxRoleMap.get("fx2");
        List<Map<String, Object>> fx3 = (List<Map<String, Object>>) fxRoleMap.get("fx3");

        fxRole.setRaPowerBase((Integer) fx2.get(0).get("base"));
        fxRole.setRaPowerInner((Integer) fx2.get(0).get("inner"));
        fxRole.setRaPowerAdditional((Integer) fx2.get(0).get("additional"));

        fxRole.setRaAgileBase((Integer) fx2.get(1).get("base"));
        fxRole.setRaAgileInner((Integer) fx2.get(1).get("inner"));
        fxRole.setRaAgileAdditional((Integer) fx2.get(1).get("additional"));

        fxRole.setRaEnduranceBase((Integer) fx2.get(2).get("base"));
        fxRole.setRaEnduranceInner((Integer) fx2.get(2).get("inner"));
        fxRole.setRaEnduranceAdditional((Integer) fx2.get(2).get("additional"));

        fxRole.setRaIntelligenceBase((Integer) fx2.get(3).get("base"));
        fxRole.setRaIntelligenceInner((Integer) fx2.get(3).get("inner"));
        fxRole.setRaIntelligenceAdditional((Integer) fx2.get(3).get("additional"));

        fxRole.setRaPerceptionBase((Integer) fx2.get(4).get("base"));
        fxRole.setRaPerceptionInner((Integer) fx2.get(4).get("inner"));
        fxRole.setRaPerceptionAdditional((Integer) fx2.get(4).get("additional"));

        fxRole.setRaDeterminedBase((Integer) fx2.get(5).get("base"));
        fxRole.setRaDeterminedInner((Integer) fx2.get(5).get("inner"));
        fxRole.setRaDeterminedAdditional((Integer) fx2.get(5).get("additional"));

        fxRole.setRaGraceBase((Integer) fx2.get(6).get("base"));
        fxRole.setRaGraceInner((Integer) fx2.get(6).get("inner"));
        fxRole.setRaGraceAdditional((Integer) fx2.get(6).get("additional"));

        fxRole.setRaControlBase((Integer) fx2.get(7).get("base"));
        fxRole.setRaControlInner((Integer) fx2.get(7).get("inner"));
        fxRole.setRaControlAdditional((Integer) fx2.get(7).get("additional"));

        fxRole.setRaCalmBase((Integer) fx2.get(8).get("base"));
        fxRole.setRaCalmInner((Integer) fx2.get(8).get("inner"));
        fxRole.setRaCalmAdditional((Integer) fx2.get(8).get("additional"));

        //
        //

        fxRole.setExerciseBase((Integer) fx3.get(0).get("base"));
        fxRole.setExerciseAdditional((Integer) fx3.get(0).get("additional"));
        fxRole.setExerciseProfessional((String)fx3.get(0).get("professional"));

        fxRole.setShootingBase((Integer) fx3.get(1).get("base"));
        fxRole.setShootingAdditional((Integer) fx3.get(1).get("additional"));
        fxRole.setShootingProfessional((String)fx3.get(1).get("professional"));

        fxRole.setWushuBase((Integer) fx3.get(2).get("base"));
        fxRole.setWushuAdditional((Integer) fx3.get(2).get("additional"));
        fxRole.setWushuProfessional((String)fx3.get(2).get("professional"));

        fxRole.setSurvivalBase((Integer) fx3.get(3).get("base"));
        fxRole.setSurvivalAdditional((Integer) fx3.get(3).get("additional"));
        fxRole.setSurvivalProfessional((String)fx3.get(3).get("professional"));

        fxRole.setKnowledgeBase((Integer) fx3.get(4).get("base"));
        fxRole.setKnowledgeAdditional((Integer) fx3.get(4).get("additional"));
        fxRole.setKnowledgeProfessional((String)fx3.get(4).get("professional"));

        fxRole.setEquipmentUseBase((Integer) fx3.get(5).get("base"));
        fxRole.setEquipmentUseAdditional((Integer) fx3.get(5).get("additional"));
        fxRole.setEquipmentUseProfessional((String)fx3.get(5).get("professional"));

        fxRole.setCraftBase((Integer) fx3.get(6).get("base"));
        fxRole.setCraftAdditional((Integer) fx3.get(6).get("additional"));
        fxRole.setCraftProfessional(((String)fx3.get(6).get("professional")));

        fxRole.setFocusBase((Integer) fx3.get(7).get("base"));
        fxRole.setFocusAdditional((Integer) fx3.get(7).get("additional"));
        fxRole.setFocusProfessional((String)fx3.get(7).get("professional"));

        fxRole.setInsightBase((Integer) fx3.get(8).get("base"));
        fxRole.setInsightAdditional((Integer) fx3.get(8).get("additional"));
        fxRole.setInsightProfessional((String)fx3.get(8).get("professional"));

        fxRole.setSecretBase((Integer) fx3.get(9).get("base"));
        fxRole.setSecretAdditional((Integer) fx3.get(9).get("additional"));
        fxRole.setSecretProfessional((String)fx3.get(9).get("professional"));

        fxRole.setExpressBase((Integer) fx3.get(10).get("base"));
        fxRole.setExpressAdditional((Integer) fx3.get(10).get("additional"));
        fxRole.setExpressProfessional((String)fx3.get(10).get("professional"));

        fxRole.setSocialBase((Integer) fx3.get(11).get("base"));
        fxRole.setSocialAdditional((Integer) fx3.get(11).get("additional"));
        fxRole.setSocialProfessional((String)fx3.get(11).get("professional"));

        modelMap.put("success", fxRoleService.addFxRole(fxRole));
        return modelMap;
    }

    @RequestMapping(value = "/modifyfxrole", method = RequestMethod.POST)
    private Map<String, Object> modifyFxRole(@RequestBody FxRole fxRole){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", fxRoleService.modifyFxRole(fxRole));
        return modelMap;
    }

    @RequestMapping(value = "/removefxrole", method = RequestMethod.GET)
    private Map<String, Object> removeFxRole(Integer fxRoleId){
        Map<String, Object> modelMap = new HashMap<>();
        modelMap.put("success", fxRoleService.deleteFxRole(fxRoleId));
        return modelMap;
    }
}
