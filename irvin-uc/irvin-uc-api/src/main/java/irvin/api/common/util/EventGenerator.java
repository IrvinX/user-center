//package irvin.api.common.util;
//
//import irvin.api.bussiness.domain.Event;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @author irvin
// * @date Create in 上午9:41 2017/11/15
// * @description
// */
//@Component
//public class EventGenerator {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    IDGenerator idGenerator;
//
//    public <T> Event generator(T record, String dataId, int action) {
//        return generator(idGenerator.idGenerator(), record, dataId, action);
//    }
//
//    public <T> Event generator(String transactionId, T record, String dataId, int action) {
//        if (null == transactionId || transactionId.isEmpty())
//            return generator(record, dataId, action);
//        Event event = new Event();
//        event.setDataId(dataId);
//        event.setClazz(record.getClass());
//        event.setTransactionId(transactionId);
//        event.setAction(action);
//        return null;
//    }
//}
