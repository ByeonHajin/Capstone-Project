import axios from 'axios';

const POST_BASE_URL = "http://192.168.35.145:8080/post"
//윤정ip

export const postData = async(postData) => {
    const title = postData.title;
    const restaurant = postData.restaurant;

    const headers = {
        'Access-Control-Allow-Origin' : "*"
    }

    try {
        const response = await axios.post(POST_BASE_URL, {
            title: '1',
            order_time: '2022-04-14T13:44:30.327959',
            post_time: '2022-04-14T13:44:30.327959',
            shooting_user: '2',
            p_location: '2',
            u_id: 1,
            r_id: 1,
        }, {headers:headers}, {withCredentials: false})
        console.log(response);
    } catch(error) {
        console.error(error);
    }
}