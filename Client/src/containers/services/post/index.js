import axios from 'axios';

const POST_BASE_URL = "http://localhost:8080/post"

export const postData = async(postData) => {
    const title = postData.title;
    const restaurant = postData.restaurant;

    const headers = {
        'Access-Control-Allow-Origin' : "*"
    }
    
    try {
        console.log(postData);
        const response = await axios.post(POST_BASE_URL, {
            "title" : "title3",
            "order_time" : "2022-04-14T13:44:30.327959",
            "post_time" : "2022-04-14T11:44:30.327959",
            "shooting_user" : "shooting_user2",
            "p_location" : "p_location2",
            "u_id" : 1,
            "r_id" : 1
        }, {headers:headers}, {withCredentials: false})
        console.log(response);
    } catch(error) {
        console.error(error);
    }
}