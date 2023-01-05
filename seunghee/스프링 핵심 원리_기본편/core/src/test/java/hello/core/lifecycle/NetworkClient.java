package hello.core.lifecycle;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // 서비스 시작시 호출
    public void connect() {
        System.out.println("connect:  = " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + "message = " + message);
    }

    // 서비스 종료시 호출
    public void disconnect() {
        System.out.println("close: " + url);
    }

    @PostConstruct
    public void init() {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메세지");
    }

    @PreDestroy
    public void close() {
        System.out.println("NetworkClient.close");
        disconnect();
    }

    // 인터페이스로 생명주기 구현
//    // 의존성 주입이 끝나면 로출
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        connect();
//        call("초기화 연결 메세지");
//    }
//
//    // 빈이 종료될 때 호출
//    @Override
//    public void destroy() throws Exception {
//        disconnect();
//    }
}
