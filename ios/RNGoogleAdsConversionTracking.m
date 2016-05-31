#import "ACTReporter.h"
#import "RNGoogleAdsConversionTracking.h"

@implementation RNGoogleAdsConversionTracking

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}

RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(reportWithConversionID:(NSString*)conversionId label:(NSString*)trackingLabel value:(NSString*)trackingValue isRepeatable:(BOOL)repeatable)
{
    [ACTConversionReporter reportWithConversionID:conversionId label:trackingLabel value:trackingValue isRepeatable:repeatable];
}

@end
