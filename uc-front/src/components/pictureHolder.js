import React, {Component} from 'react'

export default class PictureHolder extends Component {
    constructor(props) {
        super(props)
        this.state = {
            src: '',
            alt: '夕阳'
        }
    }

    componentDidMount() {
        debugger
        setTimeout(() => {
            this.setState(() => {
                return {
                    src: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTxzQ0ps9xCFW4gttoJmT2H_Z2KRquMBwfwVygnCV62GmENaGPiKA'
                }
            })
        }, 2000)
    }

    render() {
        return (
            <img src={this.state.src} alt={this.state.alt}/>
        )
    }
}