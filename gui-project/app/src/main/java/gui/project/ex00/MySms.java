package gui.project.ex00;

import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;

public class MySms {
    public static void main(String[] args) {
        DefaultMessageService messageService = NurigoApp.INSTANCE.initialize("NCSGPDBEHP3RFZBU",
                "YTZEYSVSOZW767D1SW8PUHHSEQHMWTNJ",
                "https://api.coolsms.co.kr");

        Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom("01030013108");
        message.setTo("01022227460");
        message.setText("성민경입니다");

        SingleMessageSentResponse response = messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println(response);

    }

}
