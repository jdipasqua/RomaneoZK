package controllers;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Iframe;
import org.zkoss.zul.Include;
import org.zkoss.zul.Window;


public class WindowsController extends SelectorComposer<Component>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire
	private Include ventana;
	@Wire
	private Button boton;

	@Listen("onClick = #noticias")
	public void noticias()
	{
		//Window window = (Window) Path.getComponent("//indexPage/window");
		//Include frame = (Include) window.getFellowIfAny("ventana");
		//frame.setSrc("/WEB-INF/zul/noticias.zul");
		Window window = (Window) Path.getComponent("//indexPage/window");
		Iframe extPage = (Iframe) window.getFellowIfAny("extPage");
		extPage.setSrc("http://prolana.magyp.gob.ar/");
	}
}
