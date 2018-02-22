package com.xiaweizi.chatuidemo;

import cn.jiguang.imui.commons.models.IUser;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : com.xiaweizi.chatuidemo.DefaultUser
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/02/22
 *     desc   :
 * </pre>
 */

public class DefaultUser implements IUser {

    private String id;
    private String displayName;
    private String avatar;

    public DefaultUser(String id, String displayName, String avatar) {
        this.id = id;
        this.displayName = displayName;
        this.avatar = avatar;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String getAvatarFilePath() {
        return avatar;
    }
}