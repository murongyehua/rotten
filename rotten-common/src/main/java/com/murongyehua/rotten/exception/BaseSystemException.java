package com.murongyehua.rotten.exception;

import lombok.NoArgsConstructor;

/**
 * @author liul
 * @version 1.0 2019/10/22
 */
@NoArgsConstructor
public class BaseSystemException extends RuntimeException {

    private static final long serialVersionUID = 851703649338716968L;

    public BaseSystemException(String message) {
        super(message);
    }
}
