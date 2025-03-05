package chapter10.practice01;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Inventory: 재고 관리

public class InventorySystem {
	public static void main(String[] args) {
		LibraryManager manager = new LibraryManager();// 도서 관리 시스템을 인스턴스화
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("InventorySystem");
			// CRUD(크루드)
			// 저장된 데이터에 대해 작업할 수는 있는 기본 데이터 처리 기능
			System.out.println("1. Add Book"); // 생성(추가) create
			System.out.println("2. List All Book"); // 조회 read
			System.out.println("3. Search Book");
			System.out.println("4. Search by Category");
			System.out.println("5. Search by Price Range");
			System.out.println("6. Update Stock"); // 수정 update
			System.out.println("7. Remove Book"); // 삭제 delete
			System.out.println("8. Exit");
			
			try {
				//sc.nextLine()) >> 입력값이 문자열로 인식
				int choice = Integer.parseInt(sc.nextLine());// 정수로 변환
				// 숫자 형태로 변경할 수 없는 값이 입력되면 NumberFormatException 예외 발생
				
				switch (choice) {
				case 1:
					System.out.println("Enter Book ID");
					String id = sc.nextLine();
					System.out.println("Enter Book Title");
					String title = sc.nextLine();
					System.out.println("Enter Book ISBN");
					String isbn = sc.nextLine();
					System.out.println("Enter Book Author");
					String author = sc.nextLine();
					System.out.println("Enter Book Publisher");
					String publisher = sc.nextLine();
					
					System.out.println("Enter Book Publish Year");
					int year = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Book Price");
					int price = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Book Quantity");
					int stock = Integer.parseInt(sc.nextLine());
					
					System.out.println("Enter Book Category");
					String category = sc.nextLine();
					
					manager.add(new Book(id, title, isbn, author, publisher, year, price, stock, category));
					break;
				case 2:
					manager.listAll();
					break;
				case 3:
					System.out.println("Emter Search Keyword");
					String keyword = sc.nextLine();
					List<Item> searchResults = manager.search(keyword);
					if (searchResults.isEmpty()) {
						System.out.println("No items found in keyword: " + keyword);
					} else {
						for (Item item : searchResults) {
							item.display();
						}
					}
					break;
				case 4:
					System.out.println("Enter Category: ");
					String searchCategory = sc.nextLine();
					List<Item> categoryResults = manager.searchByCategory(searchCategory);
					if (categoryResults.isEmpty()) {
						System.out.println("No items found in category: " + searchCategory);
					} else {
						for (Item item: categoryResults) {
							item.display();
						}
					}
					break;
				case 5:
					System.out.println("Enter minimum price:");
					int minPrice = Integer.parseInt(sc.nextLine());
					System.out.println("Enter maximum price:");
					int maxPrice = Integer.parseInt(sc.nextLine());
					
					List<Item> priceResults = manager.searchByPriceRange(minPrice, maxPrice);
					if (priceResults.isEmpty()) {
						System.out.println("No items in price range");
					} else {
						for (Item item: priceResults) {
							item.display();
						}
					}
					break;
				case 6:
					System.out.println("Enter Book ID to update stock");
					String updateId = sc.nextLine();
					System.out.println("Enter Quantity to add/subtract");
					int quantity = Integer.parseInt(sc.nextLine());
					
					manager.updateStock(updateId, quantity);
					break;
				case 7:
					System.out.println("Enter Book ID to remove: ");
					String removeId = sc.nextLine();
					manager.remove(removeId);
					break;
				case 8:
					System.out.println("If you want to exit. please enter 'Y'");
					if (sc.nextLine().equalsIgnoreCase("Y")) {
						System.out.println("Exit");
						sc.close();
						return;
					}
					System.out.println("Please try again");
					break;
				default:
					System.out.println("Invalid option. try again");
				}
			} catch (NumberFormatException e) {
				System.out.println("Please Enter a valid number");
			} catch (NoSuchElementException e) {
				// 검색된 내용이 없을 경우 실행
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
