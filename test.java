import com.alipay.antcode.search.components.sync.service.SyncService;
import com.alipay.linkc.common.eventbus.EventListener;
import com.alipay.linkc.endpoint.base.event.model.EventCreateEvent;
import com.alipay.linkc.endpoint.base.issues.events.IssueEsSyncEvent;

/**
 * SyncListener
 *
 * @author huke
 * @version $Id: EsSyncListener.java, v 0.1 2018年11月16日 11:11 AM huke Exp $
 */
@EventListener
@Component

if (!dynamicResources.esSyncEnabled()) {
    return;
}
