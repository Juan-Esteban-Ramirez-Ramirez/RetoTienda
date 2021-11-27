package co.com.reto.choucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;




@DefaultUrl("http://automationpractice.com/index.php")
public class PageMap extends PageObject {

    public static final Target SIGN_IN = Target.the("click on SIGN IN").located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
    public static final Target EMAIL = Target.the("ingrese email").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target PASSWORD = Target.the("ingrese password").located(By.xpath("//*[@id=\"passwd\"]"));
    public static final Target BUTTON_IN = Target.the(" Click en ingresar").located(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
    public static final Target DRESSES = Target.the("click en la pestaña dresses").located(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]"));
    public static final Target PRENDA = Target.the("click en la prenda").located(By.xpath("(//a[contains(@class,'product-name')])[1]"));
    public static final Target ADD = Target.the("click en add to car").located(By.xpath("//button[contains(@class,'exclusive')]"));
    public static final Target NEXT = Target.the("click en el boton proceed to checkout").located(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
    public static final Target NEXT_SUMMARY = Target.the("click en el boton proceed to checkout").located(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
    public static final Target NEXT_SIGN = Target.the("click en el boton proceed to checkout").located(By.xpath("//*[@id=\"center_column\"]/form/p/button/span"));
    public static final Target OK_SERVICE = Target.the("confirmar terminos de servicio").located(By.xpath("//*[@id=\"cgv\"]"));
    public static final Target NEXT_SHIPPING = Target.the("click en el boton proceed to checkout").located(By.xpath("//*[@id=\"form\"]/p/button/span"));
    public static final Target PAGO = Target.the("click en forma de pago").located(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
    public static final Target OK_PAGO = Target.the("Click en confirmar pago").located(By.xpath("//*[@id=\"cart_navigation\"]/button/span"));
    public static final Target COMPRA = Target.the("Confirmar con texto, order confirmation").located(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]"));


}


