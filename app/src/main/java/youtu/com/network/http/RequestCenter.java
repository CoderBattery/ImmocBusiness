package youtu.com.network.http;


import com.youdu.vuandroidadsdk.okhttp.CommonOkHttpClient;
import com.youdu.vuandroidadsdk.okhttp.listener.DisposeDataHandle;
import com.youdu.vuandroidadsdk.okhttp.listener.DisposeDataListener;
import com.youdu.vuandroidadsdk.okhttp.request.CommonRequest;
import com.youdu.vuandroidadsdk.okhttp.request.RequestParams;

import youtu.com.module.recommand.BaseRecommandModel;

/**
 * @author: vision
 * @function:
 * @date: 16/8/12
 */
public class RequestCenter {

    /**
     * 根据参数发送所有post请求
     * @param url
     * @param params
     * @param listener
     * @param clazz
     */
    public static void postRequest(String url, RequestParams params, DisposeDataListener listener, Class<?> clazz) {
        CommonOkHttpClient.post(
                CommonRequest.createPostRequest(url, params), new DisposeDataHandle(listener, clazz));
    }
//
//    /**
//     * 用户登陆请求
//     *
//     * @param listener
//     * @param userName
//     * @param passwd
//     */
//    public static void login(String userName, String passwd, DisposeDataListener listener) {
//
//        RequestParams params = new RequestParams();
//        params.put("mb", userName);
//        params.put("pwd", passwd);
//        RequestCenter.postRequest(HttpConstants.LOGIN, params, listener, User.class);
//    }
//
//    /**
//     * 应用版本号请求
//     *
//     * @param listener
//     */
//    public static void checkVersion(DisposeDataListener listener) {
//        RequestCenter.postRequest(HttpConstants.CHECK_UPDATE, null, listener, UpdateModel.class);
//    }
//
    public static void requestRecommandData(DisposeDataListener listener) {
        RequestCenter.postRequest(HttpConstants.HOME_RECOMMAND, null, listener, BaseRecommandModel.class);
    }

//    public static void downloadFile(String url, String path, DisposeDownloadListener listener) {
//        CommonOkHttpClient.downloadFile(CommonRequest.createGetRequest(url, null),
//                new DisposeDataHandle(listener, path));
//    }
//
//    /**
//     * 请求课程详情
//     *
//     * @param listener
//     */
//    public static void requestCourseDetail(String courseId, DisposeDataListener listener) {
//        RequestParams params = new RequestParams();
//        params.put("courseId", courseId);
//        RequestCenter.postRequest(HttpConstants.COURSE_DETAIL, params, listener, BaseCourseModel.class);
//    }
}
