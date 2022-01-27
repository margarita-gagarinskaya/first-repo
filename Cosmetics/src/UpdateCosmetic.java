import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UpdateCosmetic {

    public static Cosmetic updateData(Cosmetic upNew, String S) {
        upNew.setNameBrand(upNew.getNameBrand() + S);
        upNew.setCountry(upNew.getCountry() + S);
        return upNew;
    }

    public static Cosmetic joinTwoObject(Cosmetic object1, Cosmetic object2) {
        object1.setNameBrand(object1.getNameBrand() + object2.getNameBrand());
        object1.setCountry(object1.getCountry() + object2.getCountry());
        return object1;
    }

    public static Cosmetic[] joinPairObject(Cosmetic[] cosmeticProduct) {
        String[] massive = new String[cosmeticProduct.length];
        String[] massive1 = new String[cosmeticProduct.length];
        for (int k = 0; k < cosmeticProduct.length; k++) {
            massive[k] = cosmeticProduct[k].getNameBrand();
            massive1[k] = cosmeticProduct[k].getCountry();
        }
        for (int i = 0; i < cosmeticProduct.length; i++) {
            for (int j = 0; j < cosmeticProduct.length; j++) {
                if (i != j) {
                    cosmeticProduct[i].setNameBrand(cosmeticProduct[i].getNameBrand() + massive[j]);
                    cosmeticProduct[i].setCountry(cosmeticProduct[i].getCountry() + massive1[j]);
                }
            }
            System.out.printf("Бренд: %s\tСтрана производитель: %s\n", cosmeticProduct[i].getNameBrand(), cosmeticProduct[i].getCountry());
        }
        return cosmeticProduct;
    }

//подать в метод объекты, склеить у них поля в формате 1+2+..i...+N, 2+1+3+...i...+N, 3+1+2+4+...i...+N
// получить их из метода и с помощью цикла foreach вывести эти поля на экран

    public static Cosmetic[] joinSort(Cosmetic[] cosmeticProduct) {

//        for (int i=1;i < cosmeticProduct.length; i++) {
//                cosmeticProduct[0].setNameBrand(cosmeticProduct[0].getNameBrand() + cosmeticProduct[i].getNameBrand());
//                cosmeticProduct[0].setCountry(cosmeticProduct[0].getCountry() + cosmeticProduct[i].getCountry());
//        }
//        for (int k=1; k<cosmeticProduct.length; k++) {
//            cosmeticProduct[k].setNameBrand(cosmeticProduct[0].getNameBrand());
//            cosmeticProduct[k].setCountry(cosmeticProduct[0].getCountry());
//        }
        String s="";
        String s1="";
        for (Cosmetic c : cosmeticProduct) {
            s=s + c.getNameBrand();
            s1=s1 + c.getCountry();
        }
        for (Cosmetic g:cosmeticProduct) {
            g.setNameBrand(s);
            g.setCountry(s1);
        }
        return cosmeticProduct;
    }
}
//Переписать метод, теперь в нем используется цикл форыч и нужно чтобы у всех объектов внутри
// в полях суммированная строка была упорядочена по возрастанию (1234..., 1234..., 1234...)
