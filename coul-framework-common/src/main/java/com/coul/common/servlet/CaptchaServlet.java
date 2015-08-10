package com.coul.common.servlet;
//package com.ctg.bss.common.servlet;
//
//import java.awt.Color;
//import java.io.IOException;
//import java.io.OutputStream;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.patchca.background.SingleColorBackgroundFactory;
//import org.patchca.color.SingleColorFactory;
//import org.patchca.filter.predefined.CurvesRippleFilterFactory;
//import org.patchca.font.RandomFontFactory;
//import org.patchca.service.AbstractCaptchaService;
//import org.patchca.text.renderer.BestFitTextRenderer;
//import org.patchca.utils.encoder.EncoderHelper;
//import org.patchca.word.RandomWordFactory;
//
///**
// * Servlet implementation class CaptchaServlet
// */
//@WebServlet(description = "CaptchaServlet", urlPatterns = { "/validcode.jpg" },loadOnStartup=1)
//public class CaptchaServlet extends HttpServlet {
//	private static final long serialVersionUID = 4968328161261528097L;
//	private static MyCaptchaService cs = null;
//	public static final String VAL_CODE_ID="ValCode";
//
//	@Override
//	public void init() throws ServletException {
//		super.init();
//		// 可直接使用ConfigurableCaptchaService，然后修改配置
//		cs = new MyCaptchaService();				
//	}
//
//	@Override
//	public void destroy() {
//		cs = null;
//		super.destroy();
//	}
//
//	public void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {				
//		response.setContentType("image/png");
//		response.setHeader("cache", "no-cache");
//		HttpSession session = request.getSession(true);
//		OutputStream os = response.getOutputStream();
//		String patchca = EncoderHelper.getChallangeAndWriteImage(cs, "png", os);
//		session.setAttribute(VAL_CODE_ID, patchca);
//		
//		os.flush();
//		os.close();
//	}
//
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		this.doGet(request, response);
//	}
//
//	private class MyCaptchaService extends AbstractCaptchaService {
//		public MyCaptchaService() {
//			// 文本内容
//			wordFactory = new MyWordFactory();
//			// 字体
//			fontFactory = new RandomFontFactory();
//			// 效果
//			textRenderer = new BestFitTextRenderer();
//			// 背景
//			backgroundFactory = new SingleColorBackgroundFactory();
//			// 字体颜色
//			colorFactory = new SingleColorFactory(new Color(25, 60, 170));
//			// 样式(曲线波纹加干扰线)
//			filterFactory = new CurvesRippleFilterFactory(colorFactory);
//			// 图片长宽
//			width = 150;
//			height = 50;
//		}
//	}
//
//	private class MyWordFactory extends RandomWordFactory {
//		public MyWordFactory() {
//			// 文本范围和长度
//			characters = "abdhmnwx23456789";
//			minLength = 4;
//			maxLength = 4;
//		}
//	}
//}
