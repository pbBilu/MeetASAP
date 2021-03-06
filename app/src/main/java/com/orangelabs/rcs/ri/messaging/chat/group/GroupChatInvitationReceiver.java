/*******************************************************************************
 * Software Name : RCS IMS Stack
 *
 * Copyright (C) 2010 France Telecom S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.orangelabs.rcs.ri.messaging.chat.group;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Group chat invitation receiver
 * 
 * @author Jean-Marc AUFFRET
 */
public class GroupChatInvitationReceiver extends BroadcastReceiver {

    /**
     * Action New Group CHAT Invitation
     */
    /* package private */static final String ACTION_NEW_GC = "NEW_GC";

    @Override
    public void onReceive(Context context, Intent intent) {
        // Send intent to service
        Intent receiverIntent = new Intent(context, GroupChatIntentService.class);
        receiverIntent.putExtras(intent);
        receiverIntent.setAction(ACTION_NEW_GC);
        context.startService(receiverIntent);
    }

}
