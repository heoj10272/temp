/*Goods 객체를 하나 생성하고, 이 객체에 대한 레퍼런스 변수명을 camera로 하세요
상품이름(name) 은 "Nikon",
값(price)은 400000,
재고개수(countStock)은 30
팔린개수(countSold)는 50
모든 필드는 private 으로 설정하고 getter/setter 에 의해 접근하여야 합니다.
다음 실행결과와 같게 화면에 출력하세요.
 */

package day02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		System.out.println("상품이름: "+camera.getName()+" 상품가격: "+camera.getPrice()+
				" 재고수량: "+camera.getCountSock()+" 팔린수량: "+camera.getCountSold());
	}

}
