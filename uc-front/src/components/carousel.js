import React, {Component} from 'react'
import {Carousel} from 'antd'

import pic1 from 'pic/carousel/tm_market_1.jpg'
import pic2 from 'pic/carousel/tm_market_2.jpg'
import pic3 from 'pic/carousel/tm_market_3.jpg'
import pic4 from 'pic/carousel/tm_market_4.jpg'
import pic5 from 'pic/carousel/tm_market_5.jpg'


export default class MCarousel extends Component {

    constructor(props) {
        super(props)
    }

    componentDidMount() {

    }

    render() {
        return (
            <Carousel autoplay effect="fade">
                <div>
                    <img src={pic1} alt="pic1"/>
                </div>
                <div>
                    <img src={pic2} alt="pic2"/>
                </div>
                <div>
                    <img src={pic3} alt="pic3"/>
                </div>
                <div>
                    <img src={pic4} alt="pic4"/>
                </div>
                <div>
                    <img src={pic5} alt="pic5"/>
                </div>
            </Carousel>
        )
    }
}