import React from 'react';
import { Link } from 'react-router-dom';
import './CardItem.css'


function CardItem(props) {
    return (
        <>
        <li className='cards__item'>
          <a className='cards__item__link' href={props.path}>
            <figure className='cards__item__pic-wrap' >
              <img
                className='cards__item__img'
                alt='Article image'
                src={props.src}
              />
            </figure>
            <div className='cards__item__info'>
              <h5 className='cards__item__text'>{props.text}</h5>
            </div>
          </a>
        </li>
        </>
    );
}

export default CardItem;