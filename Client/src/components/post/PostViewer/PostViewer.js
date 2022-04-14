import React, { useState, Component } from "react";
import { PostContainer, BoxCotainer, PostButton, RestCotainer, Fee } from "./styles";

const PostInput = () => {
    //const [title, setTitle] = useState<string>("");
    //const [restaurant, setRestaurant] = useState<string>("");
    //const [category, setCategory] = useState<int>(0);
    //const [minPrice, setMinPrice] = useState<int>(null);
    //const [orderTime, setOrderTime] = useState<string>("");

    const [orderFee, setOrderFee] = useState({
        order: '',
        fee: ''
    });

    const [list,setList] = useState([])

    const { order, fee } = orderFee;

    const onTextChange = (e) => {
        const { value, name } = e.target;
        setOrderFee({
            ...orderFee,
            [name] : value
        });
    }

    const onTextReset = () => {
        setOrderFee({
            order: '',
            fee: '',
        })
    }

    const onAddFee = () => {
        //중복체크
        onTextReset();
        setList(list => [...list, orderFee.order + '원 이상 ' + orderFee.fee + '원']);
    }

    return (
        <PostContainer>
            <BoxCotainer>
                <div>제목</div>
                <input
                    placeholder="제목을 입력해주세요"
                />
            </BoxCotainer>
            <BoxCotainer>
                <div>매장</div>
                <input
                    placeholder="매장을 입력해주세요"
                />
            </BoxCotainer>
            <RestCotainer>
                <div>카테고리</div>
                <p>
                    <select name="category">
                        <option value="한식">한식</option>
                        <option value="중식">중식</option>
                        <option value="일식">일식</option>
                    </select>
                </p>
            </RestCotainer>
            <RestCotainer>
                <div>최소주문금액</div>
                <p>
                    <input 
                        placeholder="금액을 입력해주세요"
                    />
                    원
                </p>
            </RestCotainer>
            <RestCotainer>
                <div>배달비</div>
                <p>
                    <input 
                        placeholder="주문금액"
                        name="order"
                        value={order}
                        onChange={onTextChange}
                    />
                    <input 
                        placeholder="배달비"
                        name="fee"
                        value={fee}
                        onChange={onTextChange}
                    />
                    <button onClick={onAddFee}>+</button>
                </p>
            </RestCotainer>
            <Fee>
                {list.map(orderFee => (
                    <p>{orderFee}</p>
                ))}
            </Fee>
            <BoxCotainer>
                <div>주문예정시간</div>
                <input
                    type="time"
                />
            </BoxCotainer>
            <PostButton onClick={() => alert("등록완료")}>
                등록하기
            </PostButton>
        </PostContainer>
    )
};

export default PostInput