package Practice_07;



public class C20230804 {
	public static void main(String[] args) {


//		
//		08/04	
		
//		회원가입 CRUD는 완성하였지만 아직 게시판을 건들지 않아서 노래재생 플레이리스트 완성되면 
//		게시판 추가하기전에 간단히 작성 이것은 직접입력하고 CRUD 모든게 살짝 들어가있지만 분배해서
//		다시 작성해야됨
//
//		class Post {
//		    private String title;
//		    private String content;
//		Post에 여기 class만 쓸수있게 title, content 정의
//		    public Post(String title, String content) {
//		        this.title = title;
//		        this.content = content;
//		    }
//			Post 메서드에 title, content를 받음
//		    public String getTitle() {
//		        return title;
//		    }
//			제목과
//		    public String getContent() {
//		        return content;
//		    }
//		}
//			내용 반환할수있음
//		public class SimpleBoard {
//		    private ArrayList<Post> posts;
//		    private Scanner scanner;
//			
//		    public SimpleBoard() {
//		        posts = new ArrayList<>();
//		        scanner = new Scanner(System.in);
//		    }
//
//		    public void run() {
//		        while (true) {
//		            printMenu();
//		            int choice = scanner.nextInt();
//		            scanner.nextLine(); 
//					true라면 무한루프돌림
//		            switch (choice) {
//		                case 1:
//		                    writePost();
//		                    break;
//		                case 2:
//		                    showPosts();
//		                    break;
//		                case 3:
//		                    System.out.println("게시판을 종료합니다.");
//		                    scanner.close();
//		                    return;
//		                default:
//		                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//		            }
//		        }
//		    }
//						switch문 사용하여 case 3개를 정함 아직 채우지못함

//
//		    private void writePost() {
//		        System.out.println("\n게시물 작성을 시작합니다.");
//		        System.out.print("제목: ");
//		        String title = scanner.nextLine();
//		        System.out.print("내용: ");
//		        String content = scanner.nextLine();
//
//		        Post post = new Post(title, content);
//		        posts.add(post);
//
//		        System.out.println("게시물이 작성되었습니다.");
//		    }
//				게시물 작성하는 메서드 -> 제목내용을 입력받아 posts에 추가한다
//		    private void showPosts() {
//		        System.out.println("\n게시물 목록");
//		        for (int i = 0; i < posts.size(); i++) {
//		            Post post = posts.get(i);
//		            System.out.println((i + 1) + ". " + post.getTitle());
//		        }
				
//
//		        System.out.println("조회할 게시물 번호를 입력하세요 (뒤로 가려면 0 입력):");
//		        int choice = scanner.nextInt();
//		        scanner.nextLine(); // Clear the newline character from the buffer
//
//		        if (choice == 0) {
//		            return;
//		        }
//
//		        if (choice < 1 || choice > posts.size()) {
//		            System.out.println("잘못된 입력입니다.");
//		            return;
//		        }
//
//		        Post selectedPost = posts.get(choice - 1);
//		        System.out.println("\n제목: " + selectedPost.getTitle());
//		        System.out.println("내용: " + selectedPost.getContent());
//		    }	
//				적은 포스트 조회 for을 통해 출력
//				조회할 게시물 입력받고 제목, 내용 반환
//


		
		
	}	
		
	
}
