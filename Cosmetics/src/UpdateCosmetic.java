public class UpdateCosmetic {

    public static Cosmetic updateData(Cosmetic upNew, String S){
        upNew.setNameBrand(upNew.getNameBrand()+ S);
        upNew.setCountry(upNew.getCountry()+S);
        return upNew;
    }
}
