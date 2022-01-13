public class UpdateCosmetic {

    public static Cosmetic updateData(Cosmetic upNew, String S){
        upNew.setNameBrand(upNew.getNameBrand()+ S);
        upNew.setCountry(upNew.getCountry()+S);
        return upNew;
    }

    public static Cosmetic joinTwoObject(Cosmetic object1, Cosmetic object2){
        object1.setNameBrand(object1.getNameBrand()+object2.getNameBrand());
        object1.setCountry(object1.getCountry()+object2.getCountry());
        return object1;
    }
}
//        GLiti.setShadowProductCode("011");
//        GLiti.setShadowProductName("Макияж");
//        GLiti.setNameBrand("Tati");
//        GLiti.setCountry("США");
//        GLiti.setPrice(1150);
//        GLiti.setTone("Глиттер");
//        GLiti.setNumberOfColor(6);